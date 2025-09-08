package com.backendlast.controller;



import com.backendlast.model.User;

import com.backendlast.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;



import java.util.Optional;



@RestController

@RequestMapping("/api/auth")

public class AuthController {



    @Autowired

    private UserService userService;



    @PostMapping("/login")

    public String login(@RequestParam String userId, @RequestParam String password) {

        Optional<User> userOpt = userService.validateUser(userId, password);

        if (userOpt.isPresent()) {

            String role = userOpt.get().getRole();

            switch (role) {

                case "OPERATOR": return "operator-dashboard";

                case "APPROVER": return "approver-dashboard";

                case "USER": return "user-dashboard";

            }

        }

        return "Invalid credentials";

    }



    @PostMapping("/forgot-password")

    public String forgotPassword(@RequestParam String userId, @RequestParam String newPassword) {

        userService.resetPassword(userId, newPassword);

        return "Password reset successful";

    }

}
