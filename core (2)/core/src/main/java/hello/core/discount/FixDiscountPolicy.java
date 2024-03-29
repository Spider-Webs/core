package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {

        //enum 타입은 equals가 아니는 == 비교교
       if(member.getGrade()== Grade.VIP){
            return discountFixAmount;
        }else {
           return 0;
       }
    }
}
