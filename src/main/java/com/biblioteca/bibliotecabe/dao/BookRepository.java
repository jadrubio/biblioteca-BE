package com.biblioteca.bibliotecabe.dao;

import com.biblioteca.bibliotecabe.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
