package org.aadi.aadichatterbox.messaging.domain.message.aggregate;

import org.aadi.aadichatterbox.messaging.domain.message.vo.ConversationPublicId;
import org.aadi.aadichatterbox.messaging.domain.message.vo.MessageContent;
import org.jilt.Builder;

@Builder
public record MessageSendNew(MessageContent messageContent,
                             ConversationPublicId conversationPublicId) {
}
