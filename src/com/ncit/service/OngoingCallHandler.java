package com.ncit.service;

import com.ncit.entity.ArrivingCall;
import com.ncit.entity.CallSystem;
import com.ncit.entity.OngoingCall;


public class OngoingCallHandler {
    public static OngoingCall createOngoingCall(ArrivingCall arrivingCall){
        return new OngoingCall(arrivingCall.getFrom(),arrivingCall.getTo(), CallSystem.getClock()+arrivingCall.getLength());
    }

    public static void addOngoingCallToList(OngoingCall ongoingCall){
        CallSystem.getOngoingCallList().add(ongoingCall);
    }

    public static void assignArrivingCallToOngoingList(ArrivingCall arrivingCall){
        addOngoingCallToList(createOngoingCall(arrivingCall));
    }

    public static void displayAllOngoingCalls(){
        if(CallSystem.getOngoingCallList().isEmpty()){
            System.out.println("No calls in progress");
            return;
        }
        for(OngoingCall ongoingCall: CallSystem.getOngoingCallList()){
            System.out.println(ongoingCall);
        }
    }
}
