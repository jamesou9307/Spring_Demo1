package com.james.springdemo.entity;

import java.util.List;

public class MusicPlayer {

    private List<Music> musicList;

    public MusicPlayer() {
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void play(int index){

        musicList.get(index).play();
    }

}
