package com.james.springdemo.entity;

public class Book {

    private Category category;

    public Book() {
    }

    public Book(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

 public void setCategory(Category category) {
        this.category = category;
    }
    @Override
    public String toString() {
        return this.category.getId()+" "+this.category.getName();
    }
}
