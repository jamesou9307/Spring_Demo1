package com.james.springdemo.entity;

public class CDPLayer {

    private CompatDisc cd;

    public CDPLayer() {

    }

    public CDPLayer(CompatDisc cd) {
        this.cd = cd;
    }

    public CompatDisc getCd() {
        return cd;
    }

    public void setCd(CompatDisc cd) {
        this.cd = cd;
    }

    public void playMusic(int index){

        cd.play(index);

    }
}
