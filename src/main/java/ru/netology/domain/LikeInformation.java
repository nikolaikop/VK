package ru.netology.domain;

public class LikeInformation {
    private int counter;
    private boolean isLiked;

    public int getCount() {
        return counter;
    }

    public void setCount(int counter) {
        this.counter = counter;
    }

    public boolean getIsLiked() {
        return isLiked;
    }

    public void setIsLiked(boolean isLiked) {
        this.isLiked = isLiked;
    }
}
