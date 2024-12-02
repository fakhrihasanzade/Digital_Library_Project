package com.digital_library.Digital_Library_Project1.user.service.impl;
import com.digital_library.Digital_Library_Project1.user.dto.request.UserRequestForUser;
import com.digital_library.Digital_Library_Project1.user.dto.response.UserResponseForUser;
import com.digital_library.Digital_Library_Project1.user.entity.User;
import com.digital_library.Digital_Library_Project1.user.mapper.UserMapper;
import com.digital_library.Digital_Library_Project1.user.repository.UserRepository;
import com.digital_library.Digital_Library_Project1.user.service.UserServiceForUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImplForUser implements UserServiceForUser {

    private final UserRepository repository;

    private final UserMapper mapper;

    @Override
    public UserResponseForUser getAccountWithPasswordAndUsername(String username, String password) {
        return repository.findAll().stream()
                .filter(user -> user.getUserName()
                        .equals(username) && user.getPassword().equals(password))
                .map(mapper::toDtoForUser).toList().get(0);
    }

    @Override
    public Long getAccountIdWithPasswordAndUsername(String username, String password) {
        User user = repository.findAll().stream()
                .filter(u -> u.getUserName().equals(username) && u.getPassword().equals(password))
                .toList().get(0);
        return user.getId();
    }

    @Override
    public void updateById(Long id, UserRequestForUser dto) {
        User user = repository.findById(id).orElseThrow();
        repository.save(mapper.toEntityForUpdate(user,dto));
    }
}
