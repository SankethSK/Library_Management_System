package com.rvce.library_jmanagement.repository;

import com.rvce.library_jmanagement.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}