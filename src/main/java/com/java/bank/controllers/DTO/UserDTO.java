package com.java.bank.controllers.DTO;

import lombok.Data;

@Data
public class UserDTO {
    private int id;
    private String username;
    private String password;
    private String role;
}
