package org.aadi.aadichatterbox.messaging.domain.message.vo;

import org.aadi.aadichatterbox.shared.error.domain.Assert;

import java.time.Instant;

public record MessageSentTime(Instant date) {
    public MessageSentTime {
        Assert.field("date", date).notNull();
    }
}
