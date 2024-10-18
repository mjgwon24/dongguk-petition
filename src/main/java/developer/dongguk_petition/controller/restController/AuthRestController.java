package developer.dongguk_petition.controller.restController;

import developer.dongguk_petition.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * AuthRestController
 * - 회원가입
 * - 로그인 인증
 * @since
 * @latest
 * @auth 김이현
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class AuthRestController {
    private final AuthService authService;

}
