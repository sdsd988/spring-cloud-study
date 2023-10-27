package com.example.userservice.vo;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RequestLogin {

    @NotNull(message = "Email cannot be null")
    @Size(min = 2, message = "이메일은 2자이상이어야 합니다.")
    private String email;
    @NotNull(message = "password cannot be null")
    @Size(min = 8, message = "비밀번호는 8자이상이어야 합니다.")
    private String password;

}
