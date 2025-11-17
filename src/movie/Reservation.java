package movie;

public class Reservation {

    public void reserve81(Movie movie, int count) {
        if (movie.reserveSeat(count)) {
            System.out.println("🎟️ 예매 완료! - 박준형");
            return true;
        } else {
            System.out.println("❌ 예매 실패: 좌석 부족");
            return false;
        }
    }
}