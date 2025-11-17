package movie;

public class Reservation {

    public boolean reserve1(Movie movie, int count) {
        if (movie.reserveSeat(count)) {
            System.out.println("✅ 예매 성공: " + movie.getTitle() + ", 수량: " + count);
            System.out.println("서연경");
            return true;
        } else {
            System.out.println(" 예매 완료! -허윤서 ");
            return false;
        }
    }

    public void reserve1() {
        System.out.println("예매 완료!_허윤서");
    }
}