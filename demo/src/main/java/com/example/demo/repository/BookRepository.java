package com.example.demo.repository;

import com.example.demo.entity.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BookRepository extends JpaRepository<Book, Long>, JpaSpecificationExecutor<Book> {
    List<Book> getBooksByAuthor(String author);
    @Query("select e from Book e where e.author = ?1 and e.quantity > ?2")
    List<Book> findBooksByAuthor(String author, Integer quantity);
}