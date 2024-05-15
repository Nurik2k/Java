package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.entity.Libuser;
import com.example.demo.model.BookSpecification;
import com.example.demo.model.TestDTO;
import com.example.demo.model.UserDto;
import com.example.demo.model.UserSpecification;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.LibuserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatabaseService {
    private final BookRepository bookRepository;
    private final LibuserRepository userRepository;

    public DatabaseService(BookRepository bookRepository, LibuserRepository userRepository) {
        this.bookRepository = bookRepository;
        this.userRepository = userRepository;
    }

    public List<Book> getAllBooks(TestDTO body) {
        return bookRepository.findAll(new BookSpecification(body));
    }

    public List<Libuser> getAllLibusers(UserDto body) {
        return userRepository.findAll(new UserSpecification(body));
    }
}
