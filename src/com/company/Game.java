package com.company;

 class Game {
     // Fields
     private String title;
     private int releaseDate;
     private long copiesSold;

      Game(String title, int releaseDate, long copiesSold) {
         this.title = title;
         this.releaseDate = releaseDate;
         this.copiesSold = copiesSold;
     }

     public String getTitle() {
         return title;
     }

     public void setTitle(String title) {
         this.title = title;
     }

     public int getReleaseDate() {
         return releaseDate;
     }

     public void setReleaseDate(int releaseDate) {
         this.releaseDate = releaseDate;
     }

     public long getCopiesSold() {
         return copiesSold;
     }

     public void setCopiesSold(long copiesSold) {
         this.copiesSold = copiesSold;
     }
 }
