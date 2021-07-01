package com.google;

import java.util.ArrayList;
import java.util.List;

/** A class used to represent a Playlist */
class VideoPlaylist {

    private List<String> playlist;
    private String playlistname;

    VideoPlaylist(){
    this.playlist = new ArrayList<>();
    }

    public String getPlaylistname() {
        String name = playlistname;
        return name;
    }
    public void setPlaylistname(String name){
        this.playlistname = name;

    }
}
