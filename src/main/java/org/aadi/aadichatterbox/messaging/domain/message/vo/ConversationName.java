package org.aadi.aadichatterbox.messaging.domain.message.vo;

import org.aadi.aadichatterbox.shared.error.domain.Assert;

public record ConversationName(String name) {

    public ConversationName {
        Assert.field("name", name).minLength(3).maxLength(255);
    }
}
