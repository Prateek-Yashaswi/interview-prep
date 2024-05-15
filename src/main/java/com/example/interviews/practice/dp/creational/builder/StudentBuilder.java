package com.example.interviews.practice.dp.creational.builder;

public class StudentBuilder {
    private Integer id;
    private String name;

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    public StudentBuilder setId(Integer id) {
        this.id = id;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Student build() {
        return new Student(id, name);
    }
}
