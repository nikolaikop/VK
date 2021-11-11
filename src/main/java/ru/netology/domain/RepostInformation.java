package ru.netology.domain;

public class RepostInformation {
    private int counter;
    private int[] userReposted;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int[] getUserReposted() {
        return userReposted;
    }

    public void setUserReposted(int[] userReposted) {
        this.userReposted = userReposted;
    }
}
