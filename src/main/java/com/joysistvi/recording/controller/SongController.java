package com.joysistvi.recording.controller;

import com.joysistvi.recording.model.Album;
import com.joysistvi.recording.model.Song;
import com.joysistvi.recording.service.AlbumService;
import com.joysistvi.recording.service.SongService;

import java.util.List;

public class SongController {
    private final SongService songService;
    private final AlbumService albumService;

    public SongController(SongService songService, AlbumService albumService) {
        this.songService = songService;
        this.albumService = albumService;
    }

    public List<Song> handleViewAllSongs() {
        return songService.getAllSongs();
    }

    public Song handleGetSongById(int id) {
        return songService.getSongById(id);
    }

    public List<Song> handleSearchSongs(String keyword) {
        return songService.searchSongs(keyword);
    }

    public List<Song> handleViewArchivedSongs() {
        return songService.getAllArchivedSongs();
    }

    public List<Album> handleViewAvailableAlbums() {
        return albumService.getAllAlbums();
    }

    public boolean handleCreateSong(Song song) {
        return songService.createSong(song);
    }

    public boolean handleUpdateSong(Song song) {
        return songService.updateSong(song);
    }

    public boolean handleArchiveSong(int id) {
        return songService.archiveSong(id);
    }

    public boolean handleRestoreSong(int id) {
        return songService.restoreSong(id);
    }

    public boolean handleDeleteSong(int id) {
        return songService.deleteSong(id);
    }
}
