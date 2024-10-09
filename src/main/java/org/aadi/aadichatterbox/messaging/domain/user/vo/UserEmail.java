package org.aadi.aadichatterbox.messaging.domain.user.vo;

import org.aadi.aadichatterbox.shared.error.domain.Assert;

public record UserEmail(String value) {

    public UserEmail {
        Assert.field(value, value).maxLength(255);
    }
}
