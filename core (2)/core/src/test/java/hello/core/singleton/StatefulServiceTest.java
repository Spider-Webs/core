package hello.core.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.junit.jupiter.api.Assertions.*;

class StatefulServiceTest {

    @Test
    void statefulServiceSingleton(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService st1 = ac.getBean( StatefulService.class);
        StatefulService st2 = ac.getBean( StatefulService.class);

        //A 사용자 : 1000원 주무
        st1.order("userA",1000);
        //A 사용자 : 2000원 주무
        st2.order("userA",2000);

        //사용자A 주문 금액 조회
        int price = st1.getPrice();
        System.out.println("price = " + price);

        Assertions.assertThat(st1.getPrice()).isEqualTo(2000);

    }

    static class TestConfig {
        @Bean
        public StatefulService statefulService(){
            return new StatefulService();
        }
    }

}