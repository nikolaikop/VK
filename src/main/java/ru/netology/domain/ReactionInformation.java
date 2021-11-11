package ru.netology.domain;

public class ReactionInformation {
    private int counter;
    private boolean isReacted;

    public int getCount() {
        return counter;
    }

    public void setCount(int counter) {
        this.counter = counter;
    }

    public boolean getIsReacted() {
        return isReacted;
    }

    public void setIsReacted(boolean isReacted) {
        this.isReacted = isReacted;
    }
}
