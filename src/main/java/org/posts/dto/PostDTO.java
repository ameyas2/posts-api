package org.posts.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostDTO {
    private UUID id;
    private String title;
    private String description;
    private UserDTO userDTO;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String message;
    private String error;

    public static PostDTO of(String title, String description) {
        return PostDTO.builder()
                .id(UUID.randomUUID())
                .description(description)
                .title(title)
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();
    }
}
