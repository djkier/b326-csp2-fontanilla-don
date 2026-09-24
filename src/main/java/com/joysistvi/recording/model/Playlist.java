package com.joysistvi.recording.model;

import java.time.LocalDateTime;

public class Playlist {
    private int id;
    private LocalDateTime dateCreated;
    private int userId;

    public Playlist(int id, LocalDateTime dateCreated, int userId) {
        this.id = id;
        this.dateCreated = dateCreated;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
