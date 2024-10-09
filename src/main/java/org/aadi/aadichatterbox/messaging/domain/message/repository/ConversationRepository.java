package org.aadi.aadichatterbox.messaging.domain.message.repository;

import org.aadi.aadichatterbox.messaging.domain.message.aggregate.Conversation;
import org.aadi.aadichatterbox.messaging.domain.message.aggregate.ConversationToCreate;
import org.aadi.aadichatterbox.messaging.domain.message.vo.ConversationPublicId;
import org.aadi.aadichatterbox.messaging.domain.user.aggregate.User;
import org.aadi.aadichatterbox.messaging.domain.user.vo.UserPublicId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ConversationRepository {

    Conversation save(ConversationToCreate conversation, List<User> members);

    Optional<Conversation> get(ConversationPublicId conversationPublicId);

    Page<Conversation> getConversationByUserPublicId(UserPublicId publicId, Pageable pageable);

    int deleteByPublicId(UserPublicId userPublicId, ConversationPublicId conversationPublicId);

    Optional<Conversation> getConversationByUsersPublicIdAndPublicId(UserPublicId userPublicId, ConversationPublicId conversationPublicId);

    Optional<Conversation> getConversationByUserPublicIds(List<UserPublicId> publicIds);

    Optional<Conversation> getOneByPublicId(ConversationPublicId conversationPublicId);
}
