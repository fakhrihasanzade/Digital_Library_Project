package com.digital_library.Digital_Library_Project1.user.controller;

import com.digital_library.Digital_Library_Project1.user.dto.request.UserRequestForUser;
import com.digital_library.Digital_Library_Project1.user.dto.response.UserResponseForUser;
import com.digital_library.Digital_Library_Project1.user.service.UserServiceForUser;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/user/user")
public class UserControllerForUser {

    private final UserServiceForUser service;

    @GetMapping("/account/{username}/{password}")
    public UserResponseForUser getAccountWithPasswordAndUsername(
            @PathVariable String username, @PathVariable String password) {
        return service.getAccountWithPasswordAndUsername(username, password);
    }

    @GetMapping("/secret-from-user/{username}/{password}")
    public Long getAccountIdWithPasswordAndUsername(
            String username, String password) {
        return service.getAccountIdWithPasswordAndUsername(username, password);
    }

    @PutMapping("/{id}")
    public void updateById(@PathVariable Long id, @RequestBody UserRequestForUser dto) {
        service.updateById(id, dto);
    }

}
