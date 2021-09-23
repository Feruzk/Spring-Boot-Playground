package com.example.guruMVC.bootstrap;

import com.example.guruMVC.domain.Author;
import com.example.guruMVC.domain.Book;
import com.example.guruMVC.domain.Publisher;
import com.example.guruMVC.repos.AuthorRepos;
import com.example.guruMVC.repos.BookRepos;
import com.example.guruMVC.repos.PublisherRepos;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepos authorRepos;
    private final BookRepos bookRepos;
    private final PublisherRepos publisherRepos;


    public BootStrapData(AuthorRepos authorRepos, BookRepos bookRepos, PublisherRepos publisherRepos) {
        this.authorRepos = authorRepos;
        this.bookRepos = bookRepos;
        this.publisherRepos = publisherRepos;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Interesting output: ");

        Publisher publisher = new Publisher();
        publisher.setName("SFG Publisher");
        publisher.setCity("St Petersburg");
        publisher.setState("FL");

        publisherRepos.save(publisher);

        System.out.println("Publisher count: " + publisherRepos.count());


//        Author epic = new Author("Epic", "Ivan's");
//        Book ddd = new Book("Domain Driven Design","123123");
//        epic.getBooks().add(ddd);
//        ddd.getAuthors().add(epic);
//
//        ddd.setPublisher(publisher);
//        publisher.getBooks().add(ddd);
//
//        authorRepos.save(epic);
//        bookRepos.save(ddd);
//        publisherRepos.save(publisher);
//
//        Author tod = new Author("Tod","Jensen");
//        Book noEJB = new Book("J2EE Development without EJB","321321");
//        tod.getBooks().add(noEJB);
//        noEJB.getAuthors().add(tod);
//
//        noEJB.setPublisher(publisher);
//        publisher.getBooks().add(noEJB);
//
//        authorRepos.save(tod);
//        bookRepos.save(noEJB);
//        publisherRepos.save(publisher);
//
//        System.out.println("Number of Books: " + bookRepos.count());
//        System.out.println("Publisher Number of Books: " + publisher.getBooks().size());

    }
}
