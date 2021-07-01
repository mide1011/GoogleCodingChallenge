package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VideoPlayer {

    private final VideoLibrary videoLibrary;
    private String currentlyPlaying = "";

    private List<String> videoPlaylists = new ArrayList<>();
    private List<VideoPlaylist> videoPlayListsList = new ArrayList<>();

    public VideoPlayer() {
        this.videoLibrary = new VideoLibrary();
    }


    public void numberOfVideos() {
        System.out.printf("%s videos in the library%n", videoLibrary.getVideos().size());
    }

    public void showAllVideos() {

        List<String> videos = new ArrayList<>();

        for (Video video : videoLibrary.getVideos()) {
            String text = text = video.getTitle() + " " + "(" + video.getVideoId() + ")";
            if (video.getTags().isEmpty()) {
                text += " []";
            } else {
                text += " [" + video.getTags().get(0) + " " + video.getTags().get(1) + "]";
            }
            videos.add(text);
        }

        Collections.sort(videos);

        System.out.println("Here's a list of all available videos:");
        for (String vid : videos) {
            System.out.println(vid);
        }


    }

    public void playVideo(String videoId) {
        if (videoLibrary.getVideo(videoId).getTitle().isEmpty()) {
            System.out.println("Cannot play video: Video does not exist");
        } else {
            Video video = videoLibrary.getVideo(videoId);
            if (currentlyPlaying.equals("")) {
                System.out.println("Playing video: " + video.getTitle());
                currentlyPlaying = video.getTitle();
            } else {
                currentlyPlaying = "";
                System.out.println("Stopping video: " + currentlyPlaying);
                System.out.println("Playing video: " + video.getTitle());
            }


        }


    }

    public void stopVideo() {
        if (currentlyPlaying.equals("")) {
            System.out.println("Cannot stop video: No video is currently playing");

        } else {
            System.out.println("Stopping video: " + currentlyPlaying);
        }
    }

    public void playRandomVideo() {
        System.out.println("playRandomVideo needs implementation");
    }

    public void pauseVideo() {
        System.out.println("pauseVideo needs implementation");
    }

    public void continueVideo() {
        System.out.println("continueVideo needs implementation");
    }

    public void showPlaying() {
        System.out.println("showPlaying needs implementation");
    }

    public void createPlaylist(String playlistName) {
        VideoPlaylist myplaylist = new VideoPlaylist();
        myplaylist.setPlaylistname("mY_PLAYlist");
        boolean check = false;

        for (String s : videoPlaylists) {
            if (s.toUpperCase().equals(myplaylist.getPlaylistname().toUpperCase())) {
                System.out.println("Cannot create playlist: A playList with the same name already exists");
                check = true;
            }
            break;

        }
        if (!check) {
            System.out.println("Successfully created new playlist: " + myplaylist.getPlaylistname());
            videoPlaylists.add(myplaylist.getPlaylistname());
        }


    }

    public void addVideoToPlaylist(String playlistName, String videoId) {
        boolean checkVideoid = true;
        boolean checkPlaylist = true;
        for (VideoPlaylist videoPlaylist : videoPlayListsList) {
            if (videoPlaylist.getPlaylistname().isEmpty() || videoPlaylist.getPlaylistname().equals("")) {
                System.out.printf("Cannot add video to %s: Video does not exist", playlistName);

            } else {
                if (videoPlaylist.getPlaylistname().toUpperCase().equals(playlistName.toUpperCase())) {

                    System.out.printf("Cannot add video to %s: " + "Video already added" , playlistName);
                    checkPlaylist = false;
                }
                if (videoLibrary.getVideo(videoId).getTitle().isEmpty()) {
                    checkVideoid = false;
                    System.out.printf("Cannot add video to %s: Video does not exist");
                }
            }


        }
        if (checkVideoid && checkPlaylist) {
            System.out.println("Added video to my_playlist: " + videoLibrary.getVideo(videoId));
        }


    }

    public void showAllPlaylists() {
        System.out.println("showAllPlaylists needs implementation");
    }

    public void showPlaylist(String playlistName) {
        System.out.println("showPlaylist needs implementation");
    }

    public void removeFromPlaylist(String playlistName, String videoId) {
        System.out.println("removeFromPlaylist needs implementation");
    }

    public void clearPlaylist(String playlistName) {
        System.out.println("clearPlaylist needs implementation");
    }

    public void deletePlaylist(String playlistName) {
        System.out.println("deletePlaylist needs implementation");
    }

    public void searchVideos(String searchTerm) {
        System.out.println("searchVideos needs implementation");
    }

    public void searchVideosWithTag(String videoTag) {
        System.out.println("searchVideosWithTag needs implementation");
    }

    public void flagVideo(String videoId) {
        System.out.println("flagVideo needs implementation");
    }

    public void flagVideo(String videoId, String reason) {
        System.out.println("flagVideo needs implementation");
    }

    public void allowVideo(String videoId) {
        System.out.println("allowVideo needs implementation");
    }
}