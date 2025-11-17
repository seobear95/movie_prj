package movie;

public class Reservation {

    public boolean reserve_1(Movie movie, int count) {
        if (movie.reserveSeat(count)) {
            System.out.println("✅ 예매 성공: " + movie.getTitle() + ", 수량: " + count);
            System.out.println("박지수");
            return true;
        } else {
            System.out.println("❌ 예매 실패: 좌석 부족");
            return false;
        }
    }

    public void reserve1842() {
        System.out.println("예매 완료!_이민정");
    }
}