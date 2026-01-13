package com.thienphuc.backend_java_core.repository;

import com.thienphuc.backend_java_core.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByFullName(String fullName);
    Boolean existsByEmail(String email);
}

