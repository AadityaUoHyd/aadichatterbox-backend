package org.aadi.aadichatterbox.messaging.domain.message.service;

import org.aadi.aadichatterbox.infrastructure.secondary.message.ConversationViewedForNotification;
import org.aadi.aadichatterbox.messaging.domain.message.aggregate.Message;
import org.aadi.aadichatterbox.messaging.domain.message.vo.ConversationPublicId;
import org.aadi.aadichatterbox.messaging.domain.user.vo.UserPublicId;
import org.aadi.aadichatterbox.shared.service.State;

import java.util.List;

public interface MessageChangeNotifier {

    State<Void, String> send(Message message, List<UserPublicId> userToNotify);

    State<Void, String> delete(ConversationPublicId conversationPublicId, List<UserPublicId> userToNotify);

    State<Void, String> view(ConversationViewedForNotification conversationViewedForNotification, List<UserPublicId> usersToNotify);
}
