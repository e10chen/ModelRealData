package com.company;

import java.util.ArrayList;

class Game {
     // Fields
     private static ArrayList <Game> gameList;
     private int rank;
     private String title;
     private String releaseDate;
     private double copiesSold;

      Game(int rank, String title, double copiesSold, String releaseDate) {
         this.rank = rank;
         this.title = title;
         this.releaseDate = releaseDate;
         this.copiesSold = copiesSold;

         if (gameList == null) {
             gameList = new ArrayList<>();
          }
         gameList.add(this);
     }

      int getRank() { return rank; }

      void setRank(int rank) {

          this.rank = rank;

      }

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

 static void describeAll() {
          if (gameList != null) {
              gameList.forEach(Game -> {
                  System.out.println(Game.toString());

              });

          }

    }

}


