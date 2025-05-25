package com.everything_in_java.learning.springDataJpaMapping.dto;

import com.everything_in_java.learning.springDataJpaMapping.model.User;
import lombok.*;

@Getter
@Setter

public class UserResponseDto {
    private Long id;
    private String name;
    private String email;

    public UserResponseDto(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
    }
}
