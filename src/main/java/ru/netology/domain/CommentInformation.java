package ru.netology.domain;

public class CommentInformation {
    private int counter;
    private int[] canPost;
    private int[] groupsCanPost;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int[] getCanPost() {
        return canPost;
    }

    public void setCanPost(int[] canPost) {
        this.canPost = canPost;
    }

    public int[] getGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(int[] groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }
}
