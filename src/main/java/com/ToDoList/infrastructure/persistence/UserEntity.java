package com.ToDoList.infrastructure.persistence;
import com.ToDoList.core.entities.Address;
import com.ToDoList.core.entities.Task;
import com.ToDoList.core.entities.enums.AccountType;
import jakarta.persistence.*;
import lombok.Builder;

import java.time.LocalDate;
import java.util.List;
@Builder
@Entity
@Table(name = "tb_user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDate birthDate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private Address address;

    private String email;

    private String password;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Task> tasks;

    @Enumerated(EnumType.STRING)
    private AccountType accountType;
    private LocalDate creationDate;

    public UserEntity() {
    }

    public UserEntity(Long id, String name, LocalDate birthDate, Address address, String email, String password, List<Task> tasks, AccountType accountType, LocalDate creationDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
        this.email = email;
        this.password = password;
        this.tasks = tasks;
        this.accountType = accountType;
        this.creationDate = creationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
