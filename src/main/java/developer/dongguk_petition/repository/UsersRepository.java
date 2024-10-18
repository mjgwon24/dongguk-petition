package developer.dongguk_petition.repository;

import developer.dongguk_petition.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 사용자 정보 레포지토리
 * @since
 * @latest
 * @author 김진수
 */
public interface UsersRepository extends JpaRepository<Users, Long> {

}
