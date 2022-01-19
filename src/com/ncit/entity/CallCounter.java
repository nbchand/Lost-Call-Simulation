package com.ncit.entity;

public class CallCounter {
    private int processed;
    private int completed;
    private int blocked;
    private int busy;

    public CallCounter(int processed, int completed, int blocked, int busy) {
        this.processed = processed;
        this.completed = completed;
        this.blocked = blocked;
        this.busy = busy;
    }

    public CallCounter() {
        this.processed = 0;
        this.blocked = 0;
        this.completed = 0;
        this.busy = 0;
    }

    public int getProcessed() {
        return processed;
    }

    public void setProcessed(int processed) {
        this.processed = processed;
    }

    public int getCompleted() {
        return completed;
    }

    public void setCompleted(int completed) {
        this.completed = completed;
    }

    public int getBlocked() {
        return blocked;
    }

    public void setBlocked(int blocked) {
        this.blocked = blocked;
    }

    public int getBusy() {
        return busy;
    }

    public void setBusy(int busy) {
        this.busy = busy;
    }

    @Override
    public String toString() {
        return "CallCounter{" +
                "processed=" + processed +
                ", completed=" + completed +
                ", blocked=" + blocked +
                ", busy=" + busy +
                '}';
    }
}
