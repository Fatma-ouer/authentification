
package com.example.authentification.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.authentification.model.User;
import com.example.authentification.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
 User save(UserRegistrationDto registrationDto);
}
