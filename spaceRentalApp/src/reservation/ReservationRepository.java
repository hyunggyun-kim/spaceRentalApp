package reservation;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 예약 정보를 메모리에 저장하고 관리하는 저장소
 */
public class ReservationRepository {
    private static final Map<Long, Reservation> store = new ConcurrentHashMap<>();

    public Reservation save(Reservation reservation) { /* 예약 저장 로직 */ return null; }
    public Reservation findById(Long id) { /* ID로 예약 조회 로직 */ return null; }
    public List<Reservation> findByUser(Long userId) { /* 사용자로 예약 목록 조회 로직 */ return null; }
    public List<Reservation> findBySpaceBetween(Long spaceId, LocalDateTime start, LocalDateTime end) { /* 특정 기간의 공간 예약 목록 조회 로직 */ return null; }
    public boolean updateStatus(Long id, ReservationStatus status) { /* 예약 상태 업데이트 로직 */ return false; }
}
