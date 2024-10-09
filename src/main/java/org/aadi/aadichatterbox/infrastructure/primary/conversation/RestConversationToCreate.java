package org.aadi.aadichatterbox.infrastructure.primary.conversation;

import org.aadi.aadichatterbox.messaging.domain.message.aggregate.ConversationToCreate;
import org.aadi.aadichatterbox.messaging.domain.message.aggregate.ConversationToCreateBuilder;
import org.aadi.aadichatterbox.messaging.domain.message.vo.ConversationName;
import org.aadi.aadichatterbox.messaging.domain.user.vo.UserPublicId;
import org.jilt.Builder;

import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Builder
public record RestConversationToCreate(Set<UUID> members, String name) {

    public static ConversationToCreate toDomain(RestConversationToCreate restConversationToCreate) {
        RestConversationToCreateBuilder restConversationToCreateBuilder = RestConversationToCreateBuilder.restConversationToCreate();

        Set<UserPublicId> userUUIDs = restConversationToCreate.members
                .stream()
                .map(UserPublicId::new)
                .collect(Collectors.toSet());

        return ConversationToCreateBuilder.conversationToCreate()
                .name(new ConversationName(restConversationToCreate.name()))
                .members(userUUIDs)
                .build();
    }
}
