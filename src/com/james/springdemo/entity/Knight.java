package com.james.springdemo.entity;

import com.james.springdemo.quest.Quest;

public class Knight {

    private Quest quest;

    public Knight() {
    }



    public Quest getQuest() {
        return quest;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }
    
    public void doQuest(){
        
        quest.mission();
    }
}

