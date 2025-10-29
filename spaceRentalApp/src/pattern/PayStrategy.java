package pattern;

import user.User;

/**
 * [Strategy Pattern]
 * 결제 전략을 위한 인터페이스
 */
public interface PayStrategy {
    void pay(User user, int amount);
    String getName();
}
