package com.digital_library.Digital_Library_Project1.user.controller;

import com.digital_library.Digital_Library_Project1.user.dto.request.UserRequestForAdmin;
import com.digital_library.Digital_Library_Project1.user.dto.response.UserResponseForAdmin;
import com.digital_library.Digital_Library_Project1.user.entity.User;
import com.digital_library.Digital_Library_Project1.user.service.UserServiceForAdmin;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/admin/user")
public class UserControllerForAdmin {

    private final UserServiceForAdmin service;

    @GetMapping("/account/{username}/{password}")
    public User getAdminAccountWithPassword(
            @PathVariable String username, @PathVariable String password) {
        return service.getAdminAccountWithPassword(username, password);
    }

    @GetMapping("/All")
    public List<UserResponseForAdmin> getAll() {
        return service.getAll();
    }

    @GetMapping("/role/{role}")
    public List<UserResponseForAdmin> getByRole(@PathVariable String role) {
        return service.getByRole(role);
    }

    @GetMapping("/name/{name}")
    public List<UserResponseForAdmin> getByFullName(@PathVariable String name) {
        return service.getByFullName(name);
    }

    @GetMapping("/age/{age1}/{age2}")
    public List<UserResponseForAdmin> getByAgeBound(
            @PathVariable int age1, @PathVariable int age2) {
        return service.getByAgeBound(age1, age2);
    }

    @GetMapping("/number/{prefix}")
    public List<UserResponseForAdmin> getByPhonePrefix(@PathVariable String prefix){
        return service.getByPhonePrefix(prefix);
    }

    @GetMapping("/adress/{adress}")
    public List<UserResponseForAdmin> getByAdress(@PathVariable String adress){
        return service.getByAdress(adress);
    }

    @GetMapping("/id/{id}")
    public UserResponseForAdmin getById(@PathVariable Long id){
        return service.getById(id);
    }

    @PostMapping("/save")
    public void create(@RequestBody UserRequestForAdmin dto){
        service.create(dto);
    }

    @PutMapping("/{id}")
    public void updateById(@PathVariable Long id,@RequestBody UserRequestForAdmin dto){
        service.updateById(id,dto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(Long id){
        service.deleteById(id);
    }

}
