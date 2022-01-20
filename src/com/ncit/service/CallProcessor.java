package com.ncit.service;

import com.ncit.entity.ArrivingCall;
import com.ncit.entity.CallSystem;

import java.util.ArrayList;
import java.util.List;

public class CallProcessor {

    public static void scheduleArrivingCalls(){
        List<ArrivingCall> tempList = new ArrayList<>();
        for(ArrivingCall arrivingCall: CallSystem.getArrivingCallList()){
            if(arrivingCall.getArrivingTime() == CallSystem.getClock()){
                tempList.add(arrivingCall);
            }
        }
        CallSystem.getArrivingCallList().removeAll(tempList);

    }
}
