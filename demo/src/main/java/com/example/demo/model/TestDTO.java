package com.example.demo.model;

import lombok.Data;

import java.util.Date;

@Data
public class TestDTO {
    public String name;
    public Date year;
    public String authorName;

    public TestDTO() {
    }

    public TestDTO(String name, Date year, int age) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}