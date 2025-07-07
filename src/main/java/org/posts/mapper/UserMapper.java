package org.posts.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.posts.dto.UserDTO;
import org.posts.model.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "posts", ignore = true)
    UserDTO toUserDTO(User user);

    @Mapping(target = "posts", ignore = true)
    User toUser(UserDTO userDTO);
}
