package payment;

import payment.discount.DiscountPolicy;
import payment.discount.DiscountPolicyFactory;
import reservation.Reservation;
import space.SpaceRepository;
import user.MemoryUserRepository;
import user.User;
import user.UserGrade;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PaymentService {
    private final SpaceRepository spaceRepository;
    private final MemoryUserRepository userRepository;
    private final DiscountPolicyFactory policyFactory;

    public PaymentService(SpaceRepository spaceRepository,
                          MemoryUserRepository userRepository,
                          DiscountPolicyFactory policyFactory) {
        this.spaceRepository = spaceRepository;
        this.userRepository = userRepository;
        this.policyFactory = policyFactory;
    }

    public BigDecimal previewTotal(Reservation reservation) {
        // 예: 원가를 공간/예약 정보로 계산 (샘플)
        BigDecimal base = spaceRepository.findPrice(reservation.getSpaceId())
                .multiply(BigDecimal.valueOf(reservation.getTime.lap()));
        return base.setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal pay(Reservation reservation) {
        BigDecimal base = previewTotal(reservation);

        User user = userRepository.findById(reservation.getUserId());
        UserGrade grade = user.getUserGrade();

        DiscountPolicy policy = policyFactory.get(grade);
        return policy.discount(base);
    }
}
