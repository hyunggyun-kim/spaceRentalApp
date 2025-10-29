package space;

import pattern.SpaceComponent;
import java.util.List;

/**
 * 공간 정보를 담는 클래스. Decorator Pattern의 기본 컴포넌트 역할.
 */
public class Space implements SpaceComponent {
    private Long spaceId;
    private SpaceScale spaceScale; // 공간 규모
    private SpaceType spaceType; // 공간 종류 (오피스, 캐비닛 등)
    private List<UnitSpace> unitSpaceList; // 세부 단위 공간 목록 (회의실, 라운지 등)
    private List<SecuritySystem> securitySystemList; // 보안 시스템 목록 (CCTV 등)

    @Override
    public String getDescription() {
        // 기본 공간 정보 설명 로직
        return "기본 공간";
    }

    @Override
    public int getCost() {
        // 기본 공간 가격 계산 로직
        return 100000;
    }
    // --- 생성자, Getter, Setter, List 추가 메서드 등 ---
}
