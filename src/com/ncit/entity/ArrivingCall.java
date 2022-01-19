package com.ncit.entity;

public class ArrivingCall {
    private int from;
    private int to;
    private int length;
    private int arrivingTime;

    public ArrivingCall(int from, int to, int length, int arrivingTime) {
        this.from = from;
        this.to = to;
        this.length = length;
        this.arrivingTime = arrivingTime;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getArrivingTime() {
        return arrivingTime;
    }

    public void setArrivingTime(int arrivingTime) {
        this.arrivingTime = arrivingTime;
    }

    @Override
    public String toString() {
        return "ArrivingCall{" +
                "from=" + from +
                ", to=" + to +
                ", length=" + length +
                ", arrivalTime=" + arrivingTime +
                '}';
    }
}
