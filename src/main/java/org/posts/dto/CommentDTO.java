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
public class CommentDTO {
    private UUID id;
    private String description;
    private UserDTO userDTO;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private PostDTO postDTO;
    private String message;
    private String error;

    public static CommentDTO of(String description) {
        return CommentDTO.builder()
                .id(UUID.randomUUID())
                .description(description)
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();
    }
}
