package com.example.guruMVC.repos;

import com.example.guruMVC.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepos extends CrudRepository<Author, Long> {
}
