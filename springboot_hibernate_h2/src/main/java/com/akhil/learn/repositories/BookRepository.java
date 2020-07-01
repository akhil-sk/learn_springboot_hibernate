package com.akhil.learn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akhil.learn.entities.BOOK;

@Repository
public interface BookRepository extends JpaRepository<BOOK, Long> {
	
	
}