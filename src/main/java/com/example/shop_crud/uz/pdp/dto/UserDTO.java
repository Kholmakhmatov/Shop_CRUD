package com.example.shop_crud.uz.pdp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class UserDTO {

    private String fullName;

    private String email;

    private String password;
    private String confirmPassword;

    private Integer shopId;

    public UserDTO(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
