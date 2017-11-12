package com.james.springdemo.test;

import com.james.springdemo.entity.Book;
import com.james.springdemo.entity.Category;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

    public static void main(String[] argv){

        ApplicationContext classPathXmlApplicationContext
                =new FileSystemXmlApplicationContext("applicationContext.xml");
        Book book=classPathXmlApplicationContext.getBean(Book.class);
        System.out.println(book.toString());
        Category category=new Category("2345","health");
        /*book.setCategory(category);*/
        System.out.println(book.toString());

    }
}
