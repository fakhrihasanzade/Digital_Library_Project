package com.digital_library.Digital_Library_Project1.user.mapper;

import com.digital_library.Digital_Library_Project1.user.dto.request.UserRequestForAdmin;
import com.digital_library.Digital_Library_Project1.user.dto.request.UserRequestForUser;
import com.digital_library.Digital_Library_Project1.user.dto.response.UserResponseForAdmin;
import com.digital_library.Digital_Library_Project1.user.dto.response.UserResponseForUser;
import com.digital_library.Digital_Library_Project1.user.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(UserRequestForUser dto);

    User toEntity(UserRequestForAdmin dto);

    UserResponseForAdmin toDto(User user);

    User toEntityForUpdate(@MappingTarget User user, UserRequestForAdmin dto);

    User toEntityForUpdate(@MappingTarget User user, UserRequestForUser dto);

    UserResponseForUser toDtoForUser(User user);

}
