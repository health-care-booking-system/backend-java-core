package com.thienphuc.backend_java_core.service;

import com.thienphuc.backend_java_core.constant.enums.Role;
import com.thienphuc.backend_java_core.dto.request.UserRegisterRequest;
import com.thienphuc.backend_java_core.entity.User;
import com.thienphuc.backend_java_core.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public User registerUser(UserRegisterRequest request){
        if(userRepository.existsByEmail(request.getEmail())) {
            throw new RuntimeException("Người dùng này đã tồn tại.");
        }

        User user = User.builder()
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.PATIENT)
                .fullName(request.getFullName())
                .phoneNumber(request.getPhoneNumber())
                .dateOfBirth(request.getDateOfBirth())
                .gender(request.getGender())
                .build();

        return userRepository.save(user);
    }
}
