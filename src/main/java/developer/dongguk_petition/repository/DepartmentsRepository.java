package developer.dongguk_petition.repository;

import developer.dongguk_petition.entity.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 부서 정보 레포지토리
 * @since
 * @latest
 * @author 김진수
 */
public interface DepartmentsRepository extends JpaRepository<Departments, Long> {
}
