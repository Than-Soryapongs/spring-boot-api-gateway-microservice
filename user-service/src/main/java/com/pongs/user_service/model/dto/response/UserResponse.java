package com.pongs.user_service.model.dto.response;

import java.time.LocalDateTime;

public record UserResponse (
    Long id,
    String username,
    String firstName,
    String lastName,
    LocalDateTime createdAt,
    LocalDateTime updatedAt
) {
    public static UserResponse from(com.pongs.user_service.model.entity.User user) {
        return new UserResponse(
            user.getId(),
            user.getUsername(),
            user.getFirstName(),
            user.getLastName(),
            user.getCreatedAt(),
            user.getUpdatedAt()
        );
    }
}
