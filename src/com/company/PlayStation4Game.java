package com.company;

public class PlayStation4Game extends Game {
    private String genre;
    private String developer;
    private String publisher;
    private String ps4Exclusive;

    public PlayStation4Game(String title, int releaseDate, long copiesSold, String genre, String developer, String publisher, String ps4Exclusive) {
        super(title, releaseDate, copiesSold);
        this.genre = genre;
        this.developer = developer;
        this.publisher = publisher;
        this.ps4Exclusive = ps4Exclusive;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPs4Exclusive() {
        return ps4Exclusive;
    }

    public void setPs4Exclusive(String ps4Exclusive) {
        this.ps4Exclusive = ps4Exclusive;
    }
}
