package condingon.spring_boot_mybatis_p1.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Board {
    private Long id;
    private String title;
    private String content;
    private String writer;
    private String registered;
}
