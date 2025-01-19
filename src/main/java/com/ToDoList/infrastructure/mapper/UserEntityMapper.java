package com.ToDoList.infrastructure.mapper;

import com.ToDoList.core.entities.User;
import com.ToDoList.infrastructure.persistence.UserEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserEntityMapper {

    public UserEntity toEntity(User user){
        return UserEntity
                .builder()
                .id(user.getId())
                .name(user.getName())
                .birthDate(user.getBirthDate())
                .address(user.getAddress())
                .email(user.getEmail())
                .password(user.getPassword())
                .tasks(user.getTask())
                .accountType(user.getAccountType())
                .creationDate(user.getCreationDate())
                .build();
    }

    public User toDomain(UserEntity user){
        return new User(
                user.getId(),
                user.getName(),
                user.getBirthDate(),
                user.getAddress(),
                user.getEmail(),
                user.getPassword(),
                user.getAccountType(),
                user.getTasks(),
                user.getCreationDate()
        );
    }
}
