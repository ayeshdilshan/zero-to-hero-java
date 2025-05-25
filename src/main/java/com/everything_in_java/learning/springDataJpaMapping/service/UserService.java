package com.everything_in_java.learning.springDataJpaMapping.service;

import com.everything_in_java.learning.springDataJpaMapping.dto.UserRequestDto;
import com.everything_in_java.learning.springDataJpaMapping.dto.UserResponseDto;
import com.everything_in_java.learning.springDataJpaMapping.model.User;
import com.everything_in_java.learning.springDataJpaMapping.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public UserResponseDto createUser(UserRequestDto userRequestDto) {

        if (userRepository.existsByEmail(userRequestDto.getEmail())) {
            throw new IllegalArgumentException("Email already in use");
        }

        User user = new User();
        user.setName(userRequestDto.getName());
        user.setEmail(userRequestDto.getEmail());

        User savedUSer = userRepository.save(user);
        return new UserResponseDto(savedUSer);
    }
}
