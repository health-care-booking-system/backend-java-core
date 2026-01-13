package com.thienphuc.backend_java_core.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Date;

@Data
public class UserRegisterRequest {
    @NotBlank(message = "{validation.email.required}")
    @Email(message = "{validation.email.invalid}")
    private String email;

    @NotBlank(message = "{validation.password.required}")
    @Size(min = 8, message = "{validation.password.min.length}")
    private String password;

    @NotBlank(message = "{validation.fullName.required}")
    private String fullName;

    @NotBlank(message = "{validation.phoneNumber.required}")
    private String phoneNumber;

    private Date dateOfBirth;
    private String gender;
}
