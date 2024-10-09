package org.aadi.aadichatterbox.messaging.domain.user.vo;

import org.aadi.aadichatterbox.shared.error.domain.Assert;

public record UserFirstname(String value) {

    public UserFirstname {
        Assert.field(value, value).maxLength(255);
    }
}
