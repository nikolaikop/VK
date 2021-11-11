package ru.netology.domain;

public class ReactionInformation {
    private int counter;
    private int[] userReacted;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int[] getUserReacted() {
        return userReacted;
    }

    public void setUserReacted(int[] userReacted) {
        this.userReacted = userReacted;
    }
}
