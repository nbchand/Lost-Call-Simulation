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
}
