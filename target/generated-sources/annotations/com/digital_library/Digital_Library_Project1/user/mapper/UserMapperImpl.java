package com.digital_library.Digital_Library_Project1.user.mapper;

import com.digital_library.Digital_Library_Project1.user.dto.request.UserRequestForAdmin;
import com.digital_library.Digital_Library_Project1.user.dto.request.UserRequestForUser;
import com.digital_library.Digital_Library_Project1.user.dto.response.UserResponseForAdmin;
import com.digital_library.Digital_Library_Project1.user.dto.response.UserResponseForUser;
import com.digital_library.Digital_Library_Project1.user.entity.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-09T01:33:02+0400",
    comments = "version: 1.6.3, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toEntity(UserRequestForUser dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setUserName( dto.getUserName() );
        user.setFullName( dto.getFullName() );
        user.setAge( dto.getAge() );
        user.setGmail( dto.getGmail() );
        user.setPassword( dto.getPassword() );
        user.setPhoneNumber( dto.getPhoneNumber() );

        return user;
    }

    @Override
    public User toEntity(UserRequestForAdmin dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setUserName( dto.getUserName() );
        user.setFullName( dto.getFullName() );
        user.setAge( dto.getAge() );
        user.setGmail( dto.getGmail() );
        user.setPassword( dto.getPassword() );
        user.setPhoneNumber( dto.getPhoneNumber() );
        user.setRole( dto.getRole() );

        return user;
    }

    @Override
    public UserResponseForAdmin toDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponseForAdmin.UserResponseForAdminBuilder userResponseForAdmin = UserResponseForAdmin.builder();

        userResponseForAdmin.id( user.getId() );
        userResponseForAdmin.userName( user.getUserName() );
        userResponseForAdmin.fullName( user.getFullName() );
        userResponseForAdmin.age( user.getAge() );
        userResponseForAdmin.gmail( user.getGmail() );
        userResponseForAdmin.phoneNumber( user.getPhoneNumber() );
        userResponseForAdmin.role( user.getRole() );

        return userResponseForAdmin.build();
    }

    @Override
    public User toEntityForUpdate(User user, UserRequestForAdmin dto) {
        if ( dto == null ) {
            return user;
        }

        user.setUserName( dto.getUserName() );
        user.setFullName( dto.getFullName() );
        user.setAge( dto.getAge() );
        user.setGmail( dto.getGmail() );
        user.setPassword( dto.getPassword() );
        user.setPhoneNumber( dto.getPhoneNumber() );
        user.setRole( dto.getRole() );

        return user;
    }

    @Override
    public User toEntityForUpdate(User user, UserRequestForUser dto) {
        if ( dto == null ) {
            return user;
        }

        user.setUserName( dto.getUserName() );
        user.setFullName( dto.getFullName() );
        user.setAge( dto.getAge() );
        user.setGmail( dto.getGmail() );
        user.setPassword( dto.getPassword() );
        user.setPhoneNumber( dto.getPhoneNumber() );

        return user;
    }

    @Override
    public UserResponseForUser toDtoForUser(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponseForUser.UserResponseForUserBuilder userResponseForUser = UserResponseForUser.builder();

        userResponseForUser.userName( user.getUserName() );
        userResponseForUser.fullName( user.getFullName() );
        userResponseForUser.age( user.getAge() );
        userResponseForUser.gmail( user.getGmail() );
        userResponseForUser.password( user.getPassword() );
        userResponseForUser.phoneNumber( user.getPhoneNumber() );

        return userResponseForUser.build();
    }
}
