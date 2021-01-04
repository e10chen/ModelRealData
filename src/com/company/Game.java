package com.company;

 class Game {
     // Fields
     private int rank;
     private String title;
     private String releaseDate;
     private double copiesSold;

      Game(int rank, String title, String releaseDate, double copiesSold) {
         this.rank = rank;
         this.title = title;
         this.releaseDate = releaseDate;
         this.copiesSold = copiesSold;
     }

     public int getRank() { return rank; }

     public void setRank(int rank) { this.rank = rank; }

     public String getTitle() {
         return title;
     }

     public void setTitle(String title) {
         this.title = title;
     }

     public String getReleaseDate() {
         return releaseDate;
     }

     public void setReleaseDate(String releaseDate) {
         this.releaseDate = releaseDate;
     }

     public double getCopiesSold() {
         return copiesSold;
     }

     public void setCopiesSold(double copiesSold) {
         this.copiesSold = copiesSold;
     }
 }
