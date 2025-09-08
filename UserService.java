package org.example.service;



import org.example.model.User;

import org.example.repo.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



import java.util.Optional;



@Service

public class UserService {



    @Autowired

    private UserRepository userRepository;



    public Optional<User> validateUser(String userId, String password) {

        Optional<User> userOpt = userRepository.findByUserId(userId);

        if (userOpt.isPresent() && userOpt.get().getPassword().equals(password)) {

            return userOpt;

        }

        return Optional.empty();

    }



    public void resetPassword(String userId, String newPassword) {

        Optional<User> userOpt = userRepository.findByUserId(userId);

        userOpt.ifPresent(user -> {

            user.setPassword(newPassword);

            userRepository.save(user);

        });

    }

}
