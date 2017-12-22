package com.james.springdemo.test;

import com.james.springdemo.entity.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

    public static void main(String[] argv){

        ApplicationContext context
                =new FileSystemXmlApplicationContext("applicationContext.xml");
     /*   Book book=context.getBean(Book.class);
        System.out.println(book.toString());
        Category category=new Category("2345","health");
        book.setCategory(category);
        System.out.println(book.toString());*/

        Knight knight=context.getBean(Knight.class);
        knight.doQuest();

       /* CDPLayer cdpLayer=context.getBean(CDPLayer.class);
        CDPLayer cdpLayer1=context.getBean(CDPLayer.class);
        System.out.println(cdpLayer1==cdpLayer);*/
/*
        Human human=context.getBean(Human.class);
        human.useAxe();*/

      /*  MusicPlayer musicPlayer=context.getBean(MusicPlayer.class);
        for(Music music:musicPlayer.getMusicList()){
            music.play();
        }*/


    }
}
