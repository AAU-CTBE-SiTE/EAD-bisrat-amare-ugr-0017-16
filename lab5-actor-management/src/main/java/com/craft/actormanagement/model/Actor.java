package com.craft.actormanagement.model;

public class Actor {

    private int id;
    private String name;
    private String movie;

    public Actor() {
    }

    public Actor(int id, String name, String movie) {
        this.id = id;
        this.name = name;
        this.movie = movie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }
}