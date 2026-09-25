package com.joysistvi.recording;

import com.joysistvi.recording.Utility.InputUtility;
import com.joysistvi.recording.cliview.AlbumView;
import com.joysistvi.recording.cliview.ArtistView;
import com.joysistvi.recording.config.DBConnection;
import com.joysistvi.recording.controller.AlbumController;
import com.joysistvi.recording.controller.ArtistController;
import com.joysistvi.recording.repository.AlbumRepo;
import com.joysistvi.recording.repository.AlbumRepoImpl;
import com.joysistvi.recording.repository.ArtistRepo;
import com.joysistvi.recording.repository.ArtistRepoImpl;
import com.joysistvi.recording.service.AlbumService;
import com.joysistvi.recording.service.AlbumServiceImpl;
import com.joysistvi.recording.service.ArtistService;
import com.joysistvi.recording.service.ArtistServiceImpl;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DBConnection dbConnection = new DBConnection();

        // ----- Artist feature wiring -----
        ArtistRepo artistRepository = new ArtistRepoImpl(dbConnection);
        ArtistService artistService = new ArtistServiceImpl(artistRepository);
        ArtistController artistController = new ArtistController(artistService);
        ArtistView artistView = new ArtistView(artistController, scanner);

        // ----- Album feature wiring -----
        AlbumRepo albumRepository = new AlbumRepoImpl(dbConnection);
        AlbumService albumService = new AlbumServiceImpl(albumRepository);
        AlbumController albumController = new AlbumController(albumService, artistService);
        AlbumView albumView = new AlbumView(albumController, scanner);

        // ----- Main menu -----
        int choice;
        do {
            System.out.println("\n----- Recording Studio Management -----");
            System.out.println("1. Artist Management");
            System.out.println("2. Album Management");
            System.out.println("0. Exit");
            System.out.print("Choice: ");

            choice = InputUtility.readInt(scanner);

            switch (choice) {
                case 1 -> artistView.run();
                case 2 -> albumView.run();
                case 0 -> System.out.println("Exiting application...");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
