package user;

/**
 * 사용자 관련 비즈니스 로직을 처리하는 서비스
 */
public class UserService {
    private final MemoryUserRepository repository = new MemoryUserRepository();

    public User login(String id, String password) { /* 로그인 로직 */ return null; }
    public void register(User user) { /* 회원가입 로직 */ }
    public void logout(User user) { /* 로그아웃 로직 */ }
    public void editInformation(User user) { /* 회원정보 수정 로직 */ }
    public void removeUser(User user) { /* 회원탈퇴 로직 */ }
    public String userInformation(User user) { /* 회원정보 조회 로직 */ return null; }
}
