package space;

import java.util.List;
import java.util.ArrayList;

/**
 * 공간 정보를 메모리에 저장하고 관리하는 저장소
 */
public class SpaceRepository {
    private static final List<Space> store = new ArrayList<>();

    public void save(Space space) { /* 공간 저장 로직 */ }
    public Space findById(Long id) { /* ID로 공간 조회 로직 */ return null; }
    public List<Space> findAll() { /* 모든 공간 조회 로직 */ return null; }
    public void deleteById(Long id) { /* ID로 공간 삭제 로직 */ }
    public boolean updateById(Long id, Space updateSpace) { /* 공간 정보 업데이트 로직 */ return false; }
}
