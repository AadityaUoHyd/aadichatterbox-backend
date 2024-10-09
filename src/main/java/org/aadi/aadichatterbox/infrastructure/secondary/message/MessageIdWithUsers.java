package org.aadi.aadichatterbox.infrastructure.secondary.message;

import org.aadi.aadichatterbox.messaging.domain.user.vo.UserPublicId;

import java.util.List;

public record MessageIdWithUsers(ConversationViewedForNotification conversationViewedForNotification,
                                 List<UserPublicId> usersToNotify) {
}
