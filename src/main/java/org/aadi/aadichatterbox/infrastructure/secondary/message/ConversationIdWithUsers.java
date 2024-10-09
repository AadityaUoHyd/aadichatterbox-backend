package org.aadi.aadichatterbox.infrastructure.secondary.message;

import org.aadi.aadichatterbox.messaging.domain.message.vo.ConversationPublicId;
import org.aadi.aadichatterbox.messaging.domain.user.vo.UserPublicId;

import java.util.List;

public record ConversationIdWithUsers(ConversationPublicId conversationPublicId,
                                      List<UserPublicId> users) {
}
