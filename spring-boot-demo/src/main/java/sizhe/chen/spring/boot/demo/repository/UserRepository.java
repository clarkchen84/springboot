package sizhe.chen.spring.boot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sizhe.chen.spring.boot.demo.entity.User;

/**
 * @ClassName : UserRepository
 * @Description :
 * @Author : Clark Chen
 * @Date: 2020-07-19 12:28
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
