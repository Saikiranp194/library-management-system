package com.example.demo.controller;

import com.example.demo.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public Book home() {
        return new Book(1, "Java Programming");
    }
}