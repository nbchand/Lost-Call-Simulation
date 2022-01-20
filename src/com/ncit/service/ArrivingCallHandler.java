package com.ncit.service;

import com.ncit.entity.ArrivingCall;
import com.ncit.entity.CallSystem;

public class ArrivingCallHandler {
    static int to=0, from=0, length=0, arrivingTime=0;

    public static ArrivingCall createArrivingCall(){
        generateRandomCallInfo();
        return new ArrivingCall(from,to,length,arrivingTime);
    }

    public static void generateRandomCallInfo(){

        final int TIME = CallSystem.getClock();

        /*Math.random() * (max - min + 1) + min
          here the range becomes min-max, min is included whereas max is excluded
         */


        //ranges from 1-8
        to = (int)(Math.random()*8+1);
        //ranges from 1-8
        from = (int)(Math.random()*8+1);
        //length between 1-20
        length = (int)(Math.random()*20)+1;
        //generates arriving time between currentTime and 100
        arrivingTime = (int)(Math.random()*(100-(TIME+1)+1))+ (TIME+1);
        if(to==from){
            generateRandomCallInfo();
        }
    }

    public static void updateArrivingCallList(){
        ArrivingCall arrivingCall = createArrivingCall();
        CallSystem.getArrivingCallList().add(arrivingCall);
    }

    public static void displayAllArrivingCalls(){
        if(CallSystem.getArrivingCallList().isEmpty()){
            System.out.println("No calls arriving right now");
        }
        for (ArrivingCall arrivingCall: CallSystem.getArrivingCallList()){
            System.out.println(arrivingCall);
        }
    }
}
