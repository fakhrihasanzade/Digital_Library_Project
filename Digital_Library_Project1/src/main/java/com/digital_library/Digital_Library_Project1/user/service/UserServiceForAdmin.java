package com.digital_library.Digital_Library_Project1.user.service;

import com.digital_library.Digital_Library_Project1.user.dto.request.UserRequestForAdmin;
import com.digital_library.Digital_Library_Project1.user.dto.response.UserResponseForAdmin;
import com.digital_library.Digital_Library_Project1.user.entity.User;

import java.util.List;

public interface UserServiceForAdmin {

    User getAdminAccountWithPassword(String username, String password);

    List<UserResponseForAdmin> getAll();

    List<UserResponseForAdmin> getByRole(String role);

    List<UserResponseForAdmin> getByFullName(String name);

    List<UserResponseForAdmin> getByAgeBound(int age1, int age2);

    List<UserResponseForAdmin> getByPhonePrefix(String prefix);

    List<UserResponseForAdmin> getByAdress(String adress);

    UserResponseForAdmin getById(Long id);

    void create(UserRequestForAdmin dto);

    void updateById(Long id,UserRequestForAdmin dto);

    void deleteById(Long id);

}
