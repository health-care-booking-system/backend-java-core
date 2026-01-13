package com.thienphuc.backend_java_core.entity;

import com.thienphuc.backend_java_core.constant.enums.Role;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection = "users")
@Data
@Builder
public class User {

    @Id
    private String id; //ObjectId

    private String fullName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password; //BCrypt

    @Column(nullable = false,unique = true)
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private Role role; //ADMIN, DOCTOR, PATIENT

    private Date dateOfBirth;

    private String gender;

    private boolean isActive;
}
