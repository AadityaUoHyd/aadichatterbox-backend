package org.aadi.aadichatterbox.messaging.domain.user.vo;

import org.aadi.aadichatterbox.shared.error.domain.Assert;

public record UserImageUrl(String value) {

    public UserImageUrl {
        Assert.field(value, value).maxLength(255);
    }
}
