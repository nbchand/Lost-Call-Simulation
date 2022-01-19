package com.ncit.entity;

import java.util.ArrayList;
import java.util.List;

public class CallSystem {
    private static int link = 8;
    private static int line = 3;
    private static int clock = 0;
    private static int lineInUse = 0;
    private static List<ArrivingCall> arrivingCallList = new ArrayList<>();
    private static List<OngoingCall> ongoingCallList = new ArrayList<>();
    private static CallCounter callCounter = new CallCounter();

    public static int getLink() {
        return link;
    }

    public static void setLink(int link) {
        CallSystem.link = link;
    }

    public static int getLine() {
        return line;
    }

    public static void setLine(int line) {
        CallSystem.line = line;
    }

    public static int getClock() {
        return clock;
    }

    public static void setClock(int clock) {
        CallSystem.clock = clock;
    }

    public static int getLineInUse() {
        return lineInUse;
    }

    public static void setLineInUse(int lineInUse) {
        CallSystem.lineInUse = lineInUse;
    }

    public static List<ArrivingCall> getArrivingCallList() {
        return arrivingCallList;
    }

    public static void setArrivingCallList(List<ArrivingCall> arrivingCallList) {
        CallSystem.arrivingCallList = arrivingCallList;
    }

    public static List<OngoingCall> getOngoingCallList() {
        return ongoingCallList;
    }

    public static void setOngoingCallList(List<OngoingCall> ongoingCallList) {
        CallSystem.ongoingCallList = ongoingCallList;
    }

    public static CallCounter getCallCounter() {
        return callCounter;
    }

    public static void setCallCounter(CallCounter callCounter) {
        CallSystem.callCounter = callCounter;
    }
}
