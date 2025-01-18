package com.ToDoList.core.entities;

import com.ToDoList.core.entities.enums.AccountType;
import java.time.LocalDate;

public record User(
        Long id,
        String name,
        LocalDate birthDate,
        Address address,
        String email,
        String password,
        AccountType accountType,
        LocalDate creationDate
) {
}
