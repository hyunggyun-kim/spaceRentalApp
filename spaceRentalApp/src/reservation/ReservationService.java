package reservation;

import pattern.ReservationObserver;
import space.SpaceRepository;
import user.MemoryUserRepository;
import user.PaymentMethod;
import user.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * 예약 관련 비즈니스 로직을 처리하는 서비스 (Observer Pattern의 Subject 역할)
 */
public class ReservationService {
    private final MemoryUserRepository userRepository = new MemoryUserRepository();
    private final SpaceRepository spaceRepository = new SpaceRepository();
    private final ReservationRepository reservationRepository = new ReservationRepository();
    private final List<ReservationObserver> observers = new ArrayList<>();

    // Observer 등록
    public void addObserver(ReservationObserver observer) {
        observers.add(observer);
    }

    // Observer 해제
    public void removeObserver(ReservationObserver observer) {
        observers.remove(observer);
    }

    // 상태 변경 시 Observer들에게 알림
    public void notifyObservers(Reservation reservation) {
        for (ReservationObserver observer : observers) {
            observer.update(reservation);
        }
    }

    public Reservation reserve(Long userId, Long spaceId, LocalDateTime start, LocalDateTime end) {
        // ... 공간 예약 로직 ...
        // 예약이 생성되면 알림
        // notifyObservers(newReservation);
        return null;
    }

    public void cancel(Long reservationId) {
        // ... 예약 취소 로직 ...
        // 예약 상태가 변경되면 알림
        // Reservation updatedReservation = reservationRepository.findById(reservationId);
        // notifyObservers(updatedReservation);
    }

    public List<Reservation> myReservations(Long userId) { /* 나의 예약 목록 조회 로직 */ return null; }
}
