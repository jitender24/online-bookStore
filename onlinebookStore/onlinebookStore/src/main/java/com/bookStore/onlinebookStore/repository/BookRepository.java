package com.bookStore.onlinebookStore.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.bookStore.onlinebookStore.entity.Book;
public interface BookRepository extends JpaRepository<Book,Long> {

}
