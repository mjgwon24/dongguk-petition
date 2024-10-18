package developer.dongguk_petition.repository;

import developer.dongguk_petition.entity.Petitions;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 청원 정보 레포지토리
 * @since
 * @latest
 * @author 김진수
 */
public interface PetitionsRepository extends JpaRepository<Petitions, Long> {
}
