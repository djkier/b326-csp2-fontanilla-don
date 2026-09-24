package com.joysistvi.recording.config;

import com.joysistvi.recording.dao.ArtistDAO;

public class Main {
    public static void main(String[] args) {
        DBConnection db = new DBConnection();
        ArtistDAO ad = new ArtistDAO(db);

        ad.readAllArtist();
    }
}
