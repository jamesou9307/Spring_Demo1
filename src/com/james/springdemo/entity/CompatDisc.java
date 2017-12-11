package com.james.springdemo.entity;

import java.util.List;

public class CompatDisc {

    private String artisit;
    private List<String> tracks;

    public CompatDisc() {
    }

    public CompatDisc(String artisit, List<String> tracks) {
        this.artisit = artisit;
        this.tracks = tracks;
    }

    public String getArtisit() {
        return artisit;
    }

    public void setArtisit(String artisit) {
        this.artisit = artisit;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }
    public void play(int index){

       System.out.println("you are playing :"+tracks.get(index));

    }
}
