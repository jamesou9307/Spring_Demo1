package com.james.springdemo.entity;

import com.james.springdemo.tools.Axe;

public class Human {

    private Axe axe;

    public Human(){

    }

    public Human(Axe axe) {
        this.axe = axe;
    }

    public Axe getAxe() {
        return axe;
    }

    public void setAxe(Axe axe) {
        this.axe = axe;
    }
    public void useAxe(){

        axe.chop();
    }
    }
