package org.aadi.aadichatterbox.infrastructure.secondary.message;

public enum NotificationEventName {
    NEW_MESSAGE("message"), DELETE_CONVERSATION("delete-conversation"),
    VIEWS_MESSAGES("view-messages");

    final String value;

    NotificationEventName(String value) {
        this.value = value;
    }
}
