package com.ncit.service;

import com.ncit.entity.ArrivingCall;
import com.ncit.entity.CallCounter;
import com.ncit.entity.CallSystem;
import com.ncit.entity.OngoingCall;

import java.util.ArrayList;
import java.util.List;

public class CallProcessor {

    public static void scheduleArrivingCalls(){
        List<ArrivingCall> removalFromArrivalList = new ArrayList<>();
        for(ArrivingCall arrivingCall: CallSystem.getArrivingCallList()){

            if(arrivingCall.getArrivingTime() == CallSystem.getClock()){
                assignArrivingCallToOngoingList(arrivingCall);
                removalFromArrivalList.add(arrivingCall);
            }

        }
        CallSystem.getArrivingCallList().removeAll(removalFromArrivalList);

    }

    public static void assignArrivingCallToOngoingList(ArrivingCall arrivingCall){
        if(CallSystem.getLineInUse()==CallSystem.getLine()){
            incrementBlockedInCallCounter();
            incrementProcessedInCallCounter();
            return;
        }
            OngoingCallHandler.assignArrivingCallToOngoingList(arrivingCall);
            CallSystem.setLineInUse(CallSystem.getLineInUse()+1);
    }

    public static void incrementProcessedInCallCounter(){
        CallCounter callCounter = CallSystem.getCallCounter();
        callCounter.setProcessed(callCounter.getProcessed()+1);
        CallSystem.setCallCounter(callCounter);
    }

    public static void incrementBlockedInCallCounter(){
        CallCounter callCounter = CallSystem.getCallCounter();
        callCounter.setBlocked(callCounter.getBlocked()+1);
        CallSystem.setCallCounter(callCounter);
    }

    public static void incrementCompletedInCallCounter(){
        CallCounter callCounter = CallSystem.getCallCounter();
        callCounter.setCompleted(callCounter.getCompleted()+1);
        CallSystem.setCallCounter(callCounter);
    }

    public static void completeOngoingCalls(){
        List<OngoingCall> ongoingCallList = CallSystem.getOngoingCallList();
        List<OngoingCall> removeFromOngoingCallList = new ArrayList<>();
        if(ongoingCallList.isEmpty()){
            return;
        }
        for(OngoingCall ongoingCall: ongoingCallList){
            if(ongoingCall.getEnd()==CallSystem.getClock()){
                removeFromOngoingCallList.add(ongoingCall);
                incrementCompletedInCallCounter();
                incrementProcessedInCallCounter();
                CallSystem.setLineInUse(CallSystem.getLineInUse()-1);
            }
        }
        CallSystem.getOngoingCallList().removeAll(removeFromOngoingCallList);
    }
}
