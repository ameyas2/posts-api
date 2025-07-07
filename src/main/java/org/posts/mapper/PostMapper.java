package org.posts.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.posts.dto.PostDTO;
import org.posts.model.Post;


@Mapper(componentModel = "spring")
public interface PostMapper {
    @Mapping(target = "userDTO", ignore = true)
    PostDTO toPostDTO(Post post);

    @Mapping(target = "user", ignore = true)
    Post toPost(PostDTO postDTO);
}
