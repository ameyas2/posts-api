package org.posts.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.posts.dto.CommentDTO;
import org.posts.dto.PostDTO;
import org.posts.model.Comment;
import org.posts.model.Post;


@Mapper(componentModel = "spring")
public interface CommentMapper {
    @Mapping(target = "postDTO", ignore = true)
    CommentDTO toCommentDto(Comment comment);

    @Mapping(target = "post", ignore = true)
    Comment toComment(CommentDTO commentDTO);
}
