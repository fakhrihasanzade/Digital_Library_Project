package com.digital_library.Digital_Library_Project1.user.service.impl;

import com.digital_library.Digital_Library_Project1.book.entity.Book;
import com.digital_library.Digital_Library_Project1.user.dto.request.UserRequestForAdmin;
import com.digital_library.Digital_Library_Project1.user.dto.response.UserResponseForAdmin;
import com.digital_library.Digital_Library_Project1.user.dto.response.UserResponseForUser;
import com.digital_library.Digital_Library_Project1.user.entity.User;
import com.digital_library.Digital_Library_Project1.user.mapper.UserMapper;
import com.digital_library.Digital_Library_Project1.user.repository.UserRepository;
import com.digital_library.Digital_Library_Project1.user.service.UserServiceForAdmin;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImplForAdmin implements UserServiceForAdmin {

    private final UserRepository repository;

    private final UserMapper mapper;

    @Override
    public User getAdminAccountWithPassword(String username, String password) {
        return repository.findAll().stream()
                .filter(user -> user.getUserName().equals(username) && user
                        .getPassword().equals(password)).toList().get(0);
    }

    @Override
    public List<UserResponseForAdmin> getAll() {
        return repository.findAll().stream()
                .map(mapper::toDto).toList();
    }

    @Override
    public List<UserResponseForAdmin> getByRole(String role) {
        return repository.findAll().stream()
                .filter(user -> user.getRole().equals(role)).map(mapper::toDto).toList();
    }

    @Override
    public List<UserResponseForAdmin> getByFullName(String name) {
        return repository.findAll().stream()
                .filter(user -> user.getFullName().contains(name)).map(mapper::toDto).toList();
    }

    @Override
    public List<UserResponseForAdmin> getByAgeBound(int age1, int age2) {
        return repository.findAll().stream()
                .filter(user -> user.getAge() >= age1 && user.getAge() <= age2)
                .map(mapper::toDto).toList();
    }

    @Override
    public List<UserResponseForAdmin> getByPhonePrefix(String prefix) {
        return repository.findAll().stream()
                .filter(user -> user.getPhoneNumber().contains(prefix))
                .map(mapper::toDto).toList();
    }

    @Override
    public List<UserResponseForAdmin> getByAdress(String adress) {
        return repository.findAll().stream()
                .filter(user -> user.getAddress().contains(adress))
                .map(mapper::toDto).toList();
    }

    @Override
    public UserResponseForAdmin getById(Long id) {
        return mapper.toDto(repository.findById(id).orElseThrow());
    }

    @Override
    public void create(UserRequestForAdmin dto) {
        repository.save(mapper.toEntity(dto));
    }

    @Override
    public void updateById(Long id, UserRequestForAdmin dto) {
        User user = repository.findById(id).orElseThrow();
        repository.save(mapper.toEntityForUpdate(user, dto));
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
