package org.example.config;



import org.example.model.User;

import org.example.repo.UserRepository;

import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Component;



@Component

public class DataLoader implements CommandLineRunner {



    private final UserRepository userRepository;



    public DataLoader(UserRepository userRepository) {

        this.userRepository = userRepository;

    }



    @Override

    public void run(String... args) {

        if (userRepository.count() == 0) {

            userRepository.save(new User(null, "App123001", "app123@", "APPROVER"));

            userRepository.save(new User(null, "Opp123001", "opp123@", "OPERATOR"));

            userRepository.save(new User(null, "Use123001", "use123@", "USER"));

        }

    }

}
