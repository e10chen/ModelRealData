package com.company;

public class AradeGame extends Game {

    private long revenueWithoutInflation;
    private long revenueWithInflation;

    public AradeGame(String title, int releaseDate, long copiesSold, long revenueWithoutInflation, long revenueWithInflation) {
        super(title, releaseDate, copiesSold);
        this.revenueWithoutInflation = revenueWithoutInflation;
        this.revenueWithInflation = revenueWithInflation;
    }

    public long getRevenueWithoutInflation() {
        return revenueWithoutInflation;
    }

    public void setRevenueWithoutInflation(long revenueWithoutInflation) {
        this.revenueWithoutInflation = revenueWithoutInflation;
    }

    public long getRevenueWithInflation() {
        return revenueWithInflation;
    }

    public void setRevenueWithInflation(long revenueWithInflation) {
        this.revenueWithInflation = revenueWithInflation;
    }
}
