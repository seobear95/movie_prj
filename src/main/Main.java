package main;

import movie.*;

public class Main {
    public static void main(String[] args) {
        MovieList movieList = new MovieList();
        Reservation reservation = new Reservation();

        movieList.showAll();

        System.out.println("\n👉 어벤져스 2좌석 예매 시도");
        Movie selectedMovie = movieList.getMovie(2); // 어벤져스
        reservation.reserve81(selectedMovie, 2);

        System.out.println("\n🎫 남은 좌석 수: " + selectedMovie.getRemainingSeats());
    }
}
