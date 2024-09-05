package com.library.controller;

import com.library.repository.BookRepository;
import com.library.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BooksController {

    private BookRepository bookRepo;

    @Autowired
    public BooksController(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    @GetMapping(path = "/books")
    public String books(Model model) {
        model.addAttribute("books", bookRepo.findAll());
        return "books";
    }


}
