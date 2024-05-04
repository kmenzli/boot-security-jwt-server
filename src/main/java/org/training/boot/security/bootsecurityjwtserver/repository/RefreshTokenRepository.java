package org.training.boot.security.bootsecurityjwtserver.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.training.boot.security.bootsecurityjwtserver.entities.RefreshToken;

import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {

    Optional<RefreshToken> findByToken(String token);

}
