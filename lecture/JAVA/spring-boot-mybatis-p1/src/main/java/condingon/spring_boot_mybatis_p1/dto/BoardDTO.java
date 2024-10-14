package condingon.spring_boot_mybatis_p1.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardDTO {
    private Long id;
    private String title;
    private String content;
    private String writer;
    private String registered;
    private int no;
}
