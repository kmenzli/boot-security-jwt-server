package org.training.boot.security.bootsecurityjwtserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.training.boot.security.bootsecurityjwtserver.entities.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
