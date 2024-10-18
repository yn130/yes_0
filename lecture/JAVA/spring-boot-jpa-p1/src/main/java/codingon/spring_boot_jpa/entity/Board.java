package codingon.spring_boot_jpa.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name="users")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String title;

    @Column(nullable = false, length=100)
    private String content;

    @Column(nullable = false, length=10)
    private String writer;

    @Column(name="created_at", nullable = false, updatable = false,
            columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime registered;

    @PrePersist // 엔티티가 데이터베이스에 저장되기 전에 필요한 초기화 작업 수행
    protected  void onCreate() {
        // 엔티티가 처음 저장될 때 createAt 필드에 현재 시각을 저장
        // 메서드 이름 자유롭게 설정 가능 (단, 메서드 반환 타입은 void, 매개변수 x)
        registered = LocalDateTime.now();
    }
}
