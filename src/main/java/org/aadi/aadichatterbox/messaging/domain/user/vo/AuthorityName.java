package org.aadi.aadichatterbox.messaging.domain.user.vo;

import org.aadi.aadichatterbox.shared.error.domain.Assert;

public record AuthorityName(String name) {

    public AuthorityName {
        Assert.field("name", name).notNull();
    }
}
