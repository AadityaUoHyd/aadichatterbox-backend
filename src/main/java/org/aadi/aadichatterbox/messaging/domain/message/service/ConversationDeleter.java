package org.aadi.aadichatterbox.messaging.domain.message.service;

import org.aadi.aadichatterbox.messaging.domain.message.aggregate.Conversation;
import org.aadi.aadichatterbox.messaging.domain.message.repository.ConversationRepository;
import org.aadi.aadichatterbox.messaging.domain.message.vo.ConversationPublicId;
import org.aadi.aadichatterbox.messaging.domain.user.aggregate.User;
import org.aadi.aadichatterbox.shared.service.State;

import java.util.Optional;

public class ConversationDeleter {

    private final ConversationRepository conversationRepository;
    private final MessageChangeNotifier messageChangeNotifier;

    public ConversationDeleter(ConversationRepository conversationRepository, MessageChangeNotifier messageChangeNotifier) {
        this.conversationRepository = conversationRepository;
        this.messageChangeNotifier = messageChangeNotifier;
    }

    public State<ConversationPublicId, String> deleteById(ConversationPublicId conversationId, User connectedUser) {
        State<ConversationPublicId, String> stateResult;

        Optional<Conversation> conversationToDeleteOpt = this.conversationRepository.getConversationByUsersPublicIdAndPublicId(connectedUser.getUserPublicId(), conversationId);
        if (conversationToDeleteOpt.isPresent()) {
            this.conversationRepository.deleteByPublicId(connectedUser.getUserPublicId(), conversationId);
            messageChangeNotifier.delete(conversationId, conversationToDeleteOpt.get()
                    .getMembers().stream().map(User::getUserPublicId).toList());
            stateResult = State.<ConversationPublicId, String>builder().forSuccess(conversationId);
        } else {
            stateResult = State.<ConversationPublicId, String>builder().forError("This conversation doesn't belong to this user or doesn't exist");
        }
        return stateResult;
    }
}
