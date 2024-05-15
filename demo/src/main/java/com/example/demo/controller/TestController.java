package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.entity.Libuser;
import com.example.demo.model.TestDTO;
import com.example.demo.model.UserDto;
import com.example.demo.service.DatabaseService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Profile("dev")
@RestController
@RequestMapping("/v1")
public class TestController {
    private final DatabaseService databaseService;

    public TestController(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }


    @GetMapping("/")
    public List<Book> hello(@RequestBody TestDTO body) {
        return databaseService.getAllBooks(body);
    }

    @GetMapping("/users")
    public List<Libuser> hello2(@RequestBody UserDto body) {
        return databaseService.getAllLibusers(body);
    }

}
