package com.james.springdemo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.*;

/*
* 处理通知方法中的参数
* */
@Aspect
public class TrackCounter {


    private Map<Integer,Integer> trackCounts=new HashMap<Integer,Integer>();

    /*定义切点,当cd中歌曲被播放的时候开始计数*/
    @Pointcut("execution(* com.james.springdemo.entity.CDPLayer.playMusic(int ))&&args(trackNumber)")
    public void trackPlayed(int trackNumber){

    }

    /*在歌曲播放之前，先为磁道计数*/
    @Before("trackPlayed(trackNumber)")
    public void conutTrack(int trackNumber){
        int currentCount=getCurrentCount(trackNumber);
        trackCounts.put(trackNumber,currentCount+1);
    }

    public int getCurrentCount(int trackNumber){
        return trackCounts.containsKey(trackNumber)?trackCounts.get(trackNumber):0;
    }

    @After("trackPlayed(trackNumber)")
    public void showCount(int trackNumber){
        System.out.println("the song has played "+trackCounts.get(trackNumber)+"次");
    }


}

