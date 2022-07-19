package hello.core.member;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
//회원
@Getter
@Setter
@AllArgsConstructor
public class Member {

    private Long id;
    private String name;
    private Grade grade;


}

