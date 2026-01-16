package com.thienphuc.backend_java_core.entity;

import com.thienphuc.backend_java_core.constant.enums.Role;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection = "users")
@Data
@Builder
public class User {

    @Id
    private String id; //ObjectId

    private String fullName;

    @Indexed(unique = true)
    private String email;

    private String password; //BCrypt

    @Indexed(unique = true)
    private String phoneNumber;

    private Role role; //ADMIN, DOCTOR, PATIENT

    private Date dateOfBirth;

    private String gender;

    private boolean isActive;
}
