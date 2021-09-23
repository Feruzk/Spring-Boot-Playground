package com.example.guruMVC.controllers;

import com.example.guruMVC.repos.AuthorRepos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private final AuthorRepos authorRepos;

    public AuthorController(AuthorRepos authorRepos) {
        this.authorRepos = authorRepos;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model){
        model.addAttribute("authors", authorRepos.findAll());

        return "authors/list";
    }
}
