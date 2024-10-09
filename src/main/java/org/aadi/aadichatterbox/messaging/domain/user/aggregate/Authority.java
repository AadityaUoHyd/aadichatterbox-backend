package org.aadi.aadichatterbox.messaging.domain.user.aggregate;

import org.aadi.aadichatterbox.messaging.domain.user.vo.AuthorityName;
import org.aadi.aadichatterbox.shared.error.domain.Assert;
import org.jilt.Builder;

@Builder
public class Authority {

    private AuthorityName name;

    public Authority(AuthorityName name) {
        Assert.notNull("name", name);
        this.name = name;
    }

    public AuthorityName getName() {
        return name;
    }
}
