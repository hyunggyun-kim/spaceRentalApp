package reservation;

import java.time.LocalDateTime;

/**
 * 시작 시간과 종료 시간을 담는 클래스
 */
public class TimeState {
    private LocalDateTime start;
    private LocalDateTime end;

    public boolean overlap(TimeState other) { /* 시간 겹침 확인 로직 */ return false; }

    // --- 생성자, Getter, Setter ---
}
