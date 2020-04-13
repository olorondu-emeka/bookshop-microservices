package com.emeka.bookshop_inventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/books/{id}")
    public String getBook(@PathVariable int id) {
        Optional<Book> book = bookRepository.findById(id);
        return book.get().getName();
    }

    @PostMapping("/books")
    public String createBook(@RequestBody Book book) {
        bookRepository.save(book);
        return "Book created successfully";
    }
}
