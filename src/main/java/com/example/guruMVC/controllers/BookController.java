package com.example.guruMVC.controllers;

import com.example.guruMVC.repos.BookRepos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private final BookRepos bookRepos;

    public BookController(BookRepos bookRepos) {
        this.bookRepos = bookRepos;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){

        model.addAttribute("books", bookRepos.findAll());
        return "books/list";
    }
}
