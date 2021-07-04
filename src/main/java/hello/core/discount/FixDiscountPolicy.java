package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000; // 1000원 할인

    @Override
    public int discount(Member member, int price) {
        if (isVip(member)) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }

    private boolean isVip(Member member) {
        return member.getGrade() == Grade.VIP;
    }
}
