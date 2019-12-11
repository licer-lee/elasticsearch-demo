package com.licerlee.elasticsearchdemo.repository;

import com.licerlee.elasticsearchdemo.domain.BookEntity;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class BookRepositoryTest {

    @Autowired
    BookRepository bookRepository;

    @Test
    void findByName() {

        BookEntity bookEntity = new BookEntity();
        bookEntity.setName("math");
        bookEntity.setPrice(100);

        BookEntity save = bookRepository.save(bookEntity);
        String id = save.getId();
        System.out.println("save.getId() = " + id);

        Optional<BookEntity> byId = bookRepository.findById(id);
        byId.ifPresent(bookEntity1 -> System.out.println("bookEntity1.getName() = " + bookEntity1.getName()));


        Page<BookEntity> math = bookRepository.findByName("math", PageRequest.of(0, 10));
        System.out.println("math.getTotalElements() = " + math.getTotalElements());

    }
}