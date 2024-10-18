package developer.dongguk_petition.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 부서 정보 엔티티
 * @since
 * @latest
 * @author 김진수
 */
@Entity
@Getter @Setter
@NoArgsConstructor
public class Departments {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id")
    private Long id;
}
