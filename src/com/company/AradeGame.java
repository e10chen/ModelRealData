package com.company;

public class AradeGame extends Game {

    private double revenueWithoutInflation;
    private double revenueWithInflation;

    public AradeGame(int rank, String title, String releaseDate, double copiesSold, double revenueWithoutInflation, double revenueWithInflation) {
        super(rank, title, releaseDate, copiesSold);
        this.revenueWithoutInflation = revenueWithoutInflation;
        this.revenueWithInflation = revenueWithInflation;
    }

    public double getRevenueWithoutInflation() {
        return revenueWithoutInflation;
    }

    public void setRevenueWithoutInflation(long revenueWithoutInflation) {
        this.revenueWithoutInflation = revenueWithoutInflation;
    }

    public double getRevenueWithInflation() {
        return revenueWithInflation;
    }

    public void setRevenueWithInflation(long revenueWithInflation) {
        this.revenueWithInflation = revenueWithInflation;
    }
}
