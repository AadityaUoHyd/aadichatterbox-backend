package org.aadi.aadichatterbox.messaging.domain.user.vo;

import org.aadi.aadichatterbox.shared.error.domain.Assert;

public record UserLastName(String value) {

    public UserLastName {
        Assert.field(value, value).maxLength(255);
    }
}
