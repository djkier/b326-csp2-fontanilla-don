package com.joysistvi.recording.controller;

import com.joysistvi.recording.model.Album;
import com.joysistvi.recording.model.Artist;
import com.joysistvi.recording.service.AlbumService;
import com.joysistvi.recording.service.ArtistService;

import java.util.List;

public class AlbumController {
    private final AlbumService albumService;
    private final ArtistService artistService;

    public AlbumController(AlbumService albumService, ArtistService artistService) {
        this.albumService = albumService;
        this.artistService = artistService;
    }

    // READ
    public List<Album> handleViewAllAlbums() {
        return albumService.getAllAlbums();
    }

    public Album handleGetAlbumById(int id) {
        return albumService.getAlbumById(id);
    }

    public List<Album> searchAlbum(String keyword) {
        return albumService.searchAlbum(keyword);
    }

    public List<Album> handleViewArchivedAlbums() {
        return albumService.getAllArchivedAlbums();
    }

    public List<Artist> handleViewAvailableArtists() {
        return artistService.getAllArtists();
    }

    // CREATE
    public boolean handleCreateAlbum(Album album) {
        return albumService.createAlbum(album);
    }

    // UPDATE
    public boolean handleUpdateAlbum(Album album) {
        return albumService.updateAlbum(album);
    }

    // ARCHIVE / RESTORE
    public boolean handleArchiveAlbum(int id) {
        return albumService.archiveAlbum(id);
    }

    public boolean handleRestoreAlbum(int id) {
        return albumService.restoreAlbum(id);
    }

    // DELETE
    public boolean handleDeleteAlbum(int id) {
        return albumService.deleteAlbum(id);
    }
}
