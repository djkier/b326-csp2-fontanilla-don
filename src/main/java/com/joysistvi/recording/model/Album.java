package com.joysistvi.recording.model;


public class Album {
    private int id;
    private String name;
    private int year;
    private int artistId;
    private String artistName;
    private boolean isArchived;

    public Album(String name, int year, int artistId) {
        this.name = name;
        this.year = year;
        this.artistId = artistId;
    }

    public Album(int id, String name, int year, int artistId) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.artistId = artistId;
    }

    public Album(int id, String name, int year, int artistId, boolean isArchived) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.artistId = artistId;
        this.isArchived = isArchived;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public boolean isArchived() {
        return isArchived;
    }

    public void setArchived(boolean archived) {
        isArchived = archived;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", artistId=" + artistId +
                ", artistName='" + artistName + '\'' +
                ", isArchived=" + isArchived +
                '}';
    }
}
