package com.greenstitch.service;

import com.greenstitch.model.User;
import com.greenstitch.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

/**
 * UserService class implements UserDetailsService interface provided by spring security.
 * We are creating a user service class by which we can search in the database, and load the user.
 */
@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = (userRepository.findById(username));
        if (user.isEmpty()) {
            throw new UsernameNotFoundException("User is null");
        } else {
            return new org.springframework.security.core.userdetails.User(user.get().getUsername(),
                    user.get().getPassword(), new ArrayList<>());
        }
    }
}
