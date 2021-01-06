package com.company;

 class Game {
     // Fields
     protected int rank;
     protected String title;
     protected String releaseDate;
     protected double copiesSold;

      Game(int rank, String title, String releaseDate, double copiesSold) {
         this.rank = rank;
         this.title = title;
         this.releaseDate = releaseDate;
         this.copiesSold = copiesSold;
     }

      int getRank() { return rank; }

      void setRank(int rank) { this.rank = rank; }

      String getTitle() {
         return title;
     }

      void setTitle(String title) {
         this.title = title;
     }

      String getReleaseDate() {
         return releaseDate;
     }

      void setReleaseDate(String releaseDate) {
         this.releaseDate = releaseDate;
     }

      double getCopiesSold() {
         return copiesSold;
     }

      void setCopiesSold(double copiesSold) {
         this.copiesSold = copiesSold;
     }
 }
