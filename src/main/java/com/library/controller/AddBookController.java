package com.library.controller;

import com.library.model.Book;
import com.library.repository.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/addBook")
public class AddBookController {

    private BookRepository bookRepo;

    public AddBookController(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    @GetMapping//(path = "/addBook")
    public String home() {
        return "addBook";
    }

    @PostMapping
    public String processAddition(Book book) {
        bookRepo.save(book);
        return "redirect:/books";
    }

}
