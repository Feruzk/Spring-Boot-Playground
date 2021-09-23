package com.example.guruMVC.repos;

import com.example.guruMVC.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepos extends CrudRepository<Book, Long> {
}
