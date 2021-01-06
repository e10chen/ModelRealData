package com.company;

public class PlayStation4Game extends Game {

    private String genre;
    private String developer;
    private String publisher;


    public PlayStation4Game(int rank, String title, String releaseDate, long copiesSold, String genre, String developer, String publisher) {
        super(rank, title, releaseDate, copiesSold);
        this.genre = genre;
        this.developer = developer;
        this.publisher = publisher;
    }

     String getGenre() {
        return genre;
    }

     void setGenre(String genre) {
        this.genre = genre;
    }

     String getDeveloper() {
        return developer;
    }

     void setDeveloper(String developer) {
        this.developer = developer;
    }

     String getPublisher() {
        return publisher;
    }

     void setPublisher(String publisher) {
        this.publisher = publisher;
    }


@Override
    public String toString() {


    return "\"" + title + "\" had a rank of #" + rank + ". It is a " + genre + " game that was developed by the " + developer + "and publish by the" + publisher + ".  It was release on " + releaseDate + " and sold up to " + copiesSold + " million copies.";
}

}
