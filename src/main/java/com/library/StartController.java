package com.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {

    private BookRepository bookRepo;
    private UserRepository userRepo;

    @Autowired
    public StartController(BookRepository bookRepo, UserRepository userRepo) {
        this.bookRepo = bookRepo;
        this.userRepo = userRepo;
    }

    @GetMapping(path = "/home")
    public String home() {
        return "homePage";
    }

    @GetMapping(path = "/books")
    public String books() {
        return bookRepo.findAll().toString();
    }

    @GetMapping(path = "/users")
    public String users() {
        return userRepo.findAll().toString();
    }
}
