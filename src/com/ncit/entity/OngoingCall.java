package com.ncit.entity;

public class OngoingCall {
    private int from;
    private int to;
    private int end;

    public OngoingCall(int from, int to, int end) {
        this.from = from;
        this.to = to;
        this.end = end;
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

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "CallInProgress{" +
                "from=" + from +
                ", to=" + to +
                ", end=" + end +
                '}';
    }
}
