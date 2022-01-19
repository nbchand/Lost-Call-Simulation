package com.ncit.service;

import com.ncit.entity.ArrivingCall;
import com.ncit.entity.CallSystem;

import java.util.List;

public class ArrivingCallHandler {
    static int to=0, from=0, length=0, arrivingTime=0;

    public static ArrivingCall createArrivingCall(){
        generateRandomCallInfo();
        return new ArrivingCall(from,to,length,arrivingTime);
    }

    public static void generateRandomCallInfo(){

        //ranges from 1-8
        to = (int)(Math.random()*8)+1;
        //ranges from 1-8
        from = (int)(Math.random()*8)+1;
        //length between 1-20
        length = (int)(Math.random()*20)+1;
        //generates arriving time between currentTime and 100
        arrivingTime = (int)(Math.random()*100)+ CallSystem.getClock() +1;
        if(to==from){
            generateRandomCallInfo();
        }
    }

    public static void displayAllArrivingCalls(List<ArrivingCall> arrivingCallList){
        for (ArrivingCall arrivingCall: arrivingCallList){
            System.out.println(arrivingCall);
        }
    }
}
