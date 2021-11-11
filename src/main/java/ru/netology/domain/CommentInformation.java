package ru.netology.domain;

public class CommentInformation {
    private int counter;
    private boolean canPost;

    public int getCount() {
        return counter;
    }

    public void setCount(int counter) {
        this.counter = counter;
    }

    public boolean getCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }
}
