package pattern;

import space.Space;
import space.SpaceType;

/**
 * [Factory Method Pattern]
 * 공간 객체 생성을 위한 팩토리 인터페이스
 */
public interface SpaceFactory {
    Space createSpace(SpaceType type, String... options);
}
