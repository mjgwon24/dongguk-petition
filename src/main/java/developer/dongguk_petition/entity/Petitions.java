package developer.dongguk_petition.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 청원 정보 엔티티
 * @since
 * @latest
 * @author 김진수
 */
@Entity
@Getter @Setter
@NoArgsConstructor
public class Petitions {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "petition_id")
    private Long id;
}
