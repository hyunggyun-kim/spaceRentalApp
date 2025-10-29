package pattern;

import reservation.Reservation;

/**
 * [Observer Pattern]
 * 예약 상태 변경을 알림받는 옵저버 인터페이스
 */
public interface ReservationObserver {
    void update(Reservation reservation);
}
