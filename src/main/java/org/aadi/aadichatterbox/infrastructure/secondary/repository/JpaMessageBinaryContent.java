package org.aadi.aadichatterbox.infrastructure.secondary.repository;

import org.aadi.aadichatterbox.infrastructure.secondary.entity.MessageContentBinaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaMessageBinaryContent extends JpaRepository<MessageContentBinaryEntity, Long> {
}
