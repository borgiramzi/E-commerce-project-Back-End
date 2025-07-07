package com.ecomProject.ecom.services.auth;

import com.ecomProject.ecom.dto.SignupRequest;
import com.ecomProject.ecom.dto.UserDto;

public interface AuthService {

      UserDto createUser(SignupRequest signupRequest);

      Boolean hasUserWithEmail(String email);
}
