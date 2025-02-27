package org.aadi.aadichatterbox.messaging.domain.message.aggregate;

import org.aadi.aadichatterbox.shared.error.domain.Assert;

import java.util.List;

public record Messages(List<Messages> messages) {
    public Messages {
        Assert.field("messages", messages).notNull().noNullElement();
    }
}
