package com.james.springdemo.entity;

public class Music {

    private String artist;
    private String name;

    public Music() {
    }

    public Music(String artist, String name) {
        this.artist = artist;
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void play(){

        System.out.println("artist:"+artist+"music name:"+name);
    }
}
