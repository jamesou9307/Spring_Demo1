package com.james.springdemo.minstrel;

import java.io.PrintStream;

public class Minstrel {

    private PrintStream stream;

    public Minstrel() {
    }

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public PrintStream getStream() {
        return stream;
    }

    public void setStream(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest(){
        System.out.println("The knight is so brave!");
    }
    public void singAfterQuest(){
        System.out.println("The knight finish the quest!");
    }

}
