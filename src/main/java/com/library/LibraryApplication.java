package com.library;

import com.library.model.Book;
import com.library.model.ModelUser;
import com.library.repository.BookRepository;
import com.library.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

	@Bean
	public CommandLineRunner dataLoader(BookRepository bookRepo, UserRepository userRepo) {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				bookRepo.save(new Book(1,"Nice book", "This is a really nice book!"));
				bookRepo.save(new Book(2, "Some fancy stuff", "This book contains description of some fancy items"));
				bookRepo.save(new Book(3, "Prohibited book", "Please do not read this book"));
				userRepo.save(new ModelUser(1L, "majadmin", "mocnehaslo"));
				userRepo.save(new ModelUser(2L, "majuser", "slabehaslo"));
			}
		};
	}

}
