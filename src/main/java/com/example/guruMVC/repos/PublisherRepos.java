package com.example.guruMVC.repos;

import com.example.guruMVC.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepos extends CrudRepository<Publisher, Long> {
}
