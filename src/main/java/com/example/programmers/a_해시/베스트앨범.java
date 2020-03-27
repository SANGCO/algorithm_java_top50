package com.example.programmers.a_해시;

import java.util.*;

public class 베스트앨범 {

    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

    }

    public int[] solution(String[] genres, int[] plays) {
        Map<String, Genres> map = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            if (!map.containsKey(genres[i])) map.put(genres[i], new Genres(genres[i]));
            map.get(genres[i]).add(new Album(genres[i], plays[i], i));
        }





        int[] answer = {};
        return answer;
}






}

class Genres {

    private final String name;

    private final List<Album> albums;

    private int totalPlays;

    public Genres(String name) {
        this.name = name;
        this.albums = new ArrayList<>();
        this.totalPlays = 0;
    }

    public void add(Album album) {
        totalPlays += album.getPlays();
        this.albums.add(album);
    }



    public String getName() {
        return name;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public int getTotalPlays() {
        return totalPlays;
    }
}

class Album {

    private String genres;

    private int plays;

    private int index;

    public Album(String genres, int plays, int index) {
        this.genres = genres;
        this.plays = plays;
        this.index = index;
    }

    public String getGenres() {
        return genres;
    }

    public int getPlays() {
        return plays;
    }

    public int getIndex() {
        return index;
    }

}
