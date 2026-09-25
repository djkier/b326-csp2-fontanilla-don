package com.joysistvi.recording.model;

public class Song {
    private int id;
    private String title;
    private int length;
    private String genre;
    private int albumId;
    private String albumName;
    private String artistName;
    private boolean isArchived;

    public Song(String title, int length, String genre, int albumId) {
        this.title = title;
        this.length = length;
        this.genre = genre;
        this.albumId = albumId;
    }

    public Song(int id, String title, int length, String genre, int albumId) {
        this.id = id;
        this.title = title;
        this.length = length;
        this.genre = genre;
        this.albumId = albumId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
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
}
