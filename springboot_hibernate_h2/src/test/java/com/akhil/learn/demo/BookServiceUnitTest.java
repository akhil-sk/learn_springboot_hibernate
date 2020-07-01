package com.akhil.learn.demo;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.akhil.learn.entities.BOOK;
import com.akhil.learn.services.BookService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookServiceUnitTest {
 
    @Autowired
    private BookService bookService;
 
    @Test
    public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
        List<BOOK> books = bookService.list();
 
        Assert.assertEquals(books.size(), 3);
    }
}