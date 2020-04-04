package com.example.programmers.a_해시;

import java.util.*;
import java.util.stream.Collectors;

public class BestAlbum {

    // TODO 같은 재생 횟수가 들어왔을 때가 빠졌다.
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
            int[] position = genre.albums.stream().mapToInt(Album::getInitialPosition).toArray();
            answer.add(position[0]);
            if (position.length > 1) {
                answer.add(position[1]);
            }
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
            // TODO 스트림 돌리고 담아줘야 적용이된다.
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
