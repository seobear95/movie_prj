package movie;

public class Reservation {

    public boolean reserve_16(Movie movie, int count) {
        if (movie.reserveSeat(count)) {
            System.out.println("✅ 예매 성공: " + movie.getTitle() + ", 수량: " + count);
            System.out.println("이성우");
            return true;
        } else {
            System.out.println("❌ 예매 실패: 좌석 부족");
            return false;
        }
    }
    public class Reservation {
        public void reserve11() {
            System.out.println("🎟️ 예매 완료!-박현준");
        }
    }

    public void reserve1842() {
        System.out.println("예매 완료!_이성우");
    }

    public void reserve(Movie selectedMovie, int i) {
    }
}
