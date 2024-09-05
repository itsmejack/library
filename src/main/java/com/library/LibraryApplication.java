package com.library;

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
	public CommandLineRunner dataLoader(BookRepository repo) {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				repo.save(new Book(1,"Nice book", "This is a really nice book!"));
				repo.save(new Book(2, "Some fancy stuff", "This book contains description of some fancy items"));
				repo.save(new Book(3, "Prohibited book", "Please do not read this book"));
			}
		};
	}

}
