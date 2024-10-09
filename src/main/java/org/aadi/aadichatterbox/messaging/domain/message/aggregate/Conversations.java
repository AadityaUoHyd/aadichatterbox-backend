package org.aadi.aadichatterbox.messaging.domain.message.aggregate;

import org.aadi.aadichatterbox.shared.error.domain.Assert;

import java.util.List;

public record Conversations(List<Conversation> conversations) {

    public Conversations {
        Assert.field("conversations", conversations).notNull().noNullElement();
    }
}
