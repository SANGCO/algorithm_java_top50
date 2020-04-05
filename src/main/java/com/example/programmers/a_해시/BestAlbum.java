package com.example.programmers.a_해시;

import java.util.*;
import java.util.stream.Collectors;

public class BestAlbum {

    public int[] solution(String[] genres, int[] plays) {
        Map<String, Genre> map = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {

            if (!map.containsKey(genres[i])) {
                map.put(genres[i], new Genre());
            }
            map.get(genres[i]).addAlbum(new Album(plays[i], i));
        }
        List<Genre> list = map.values().stream()
                .map(Genre::calculateTotal)
                .map(Genre::sortAlbums)
                .sorted(Comparator.comparing(Genre::getTotalPlayCount, Comparator.reverseOrder()))
                .collect(Collectors.toList());
        List<Integer> answer = new ArrayList<>();

        for (Genre genre : list) {
            answer.addAll(genre.albums.stream()
                    .limit(2)
                    .mapToInt(Album::getInitialPosition)
                    .boxed()
                    .collect(Collectors.toList())
            );
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private class Genre {
        int totalPlayCount = 0;
        List<Album> albums = new ArrayList<>();

        public Genre() {
        }

        public void addAlbum(Album album) {
            albums.add(album);
        }

        public Genre calculateTotal() {
            totalPlayCount = albums.stream().mapToInt(Album::getPlayCount).sum();
            return this;
        }

        public Genre sortAlbums() {
            albums = albums.stream()
                    .sorted(Comparator.comparing(Album::getPlayCount, Comparator.reverseOrder())
                        .thenComparing(Album::getInitialPosition))
                    .collect(Collectors.toList());
            return this;
        }

        public int getTotalPlayCount() {
            return totalPlayCount;
        }
    }

    private class Album {
        int playCount;
        int initialPosition;

        public Album(int playCount, int initialPosition) {
            this.playCount = playCount;
            this.initialPosition = initialPosition;
        }

        public int getPlayCount() {
            return playCount;
        }

        public int getInitialPosition() {
            return initialPosition;
        }
    }

}
