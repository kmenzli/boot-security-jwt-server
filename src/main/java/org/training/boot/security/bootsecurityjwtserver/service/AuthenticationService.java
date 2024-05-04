package org.training.boot.security.bootsecurityjwtserver.service;

import org.training.boot.security.bootsecurityjwtserver.payload.request.AuthenticationRequest;
import org.training.boot.security.bootsecurityjwtserver.payload.request.RegisterRequest;
import org.training.boot.security.bootsecurityjwtserver.payload.response.AuthenticationResponse;

public interface AuthenticationService {
    AuthenticationResponse register(RegisterRequest request);
    AuthenticationResponse authenticate(AuthenticationRequest request);
}
