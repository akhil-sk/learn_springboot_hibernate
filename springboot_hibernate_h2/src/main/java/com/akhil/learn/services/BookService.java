package com.akhil.learn.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhil.learn.entities.BOOK;
import com.akhil.learn.repositories.BookRepository;

@Service
public class BookService {
 
    @Autowired
    private BookRepository bookRepository;
 
    public List<BOOK> list() {
        return bookRepository.findAll();
    }
}