package com.joysistvi.recording.repository;

import com.joysistvi.recording.model.Song;

import java.util.List;

public interface SongRepo {
    List<Song> getAllSongs();
    Song getSongById(int id);
    List<Song> searchSongs(String keyword);
    boolean createSong(Song song);
    boolean updateSong(Song song);
    boolean archiveSong(int id);
    boolean restoreSong(int id);
    boolean deleteSong(int id);
    List<Song> getAllArchivedSongs();
}
