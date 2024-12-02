package com.digital_library.Digital_Library_Project1.user.service;

import com.digital_library.Digital_Library_Project1.user.dto.request.UserRequestForUser;
import com.digital_library.Digital_Library_Project1.user.dto.response.UserResponseForUser;

public interface UserServiceForUser {

    UserResponseForUser getAccountWithPasswordAndUsername(String username, String password);

    Long getAccountIdWithPasswordAndUsername(String username, String password);

    void updateById(Long id, UserRequestForUser dto);

}
