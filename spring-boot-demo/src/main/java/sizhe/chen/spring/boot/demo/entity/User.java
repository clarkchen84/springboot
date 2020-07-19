package sizhe.chen.spring.boot.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

/**
 * @ClassName : User
 * @Description :
 * @Author : Clark Chen
 * @Date: 2020-07-19 12:09
 */
@Entity
@Data
@Table(name = "t_user")
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private LocalDate birthday;

    private String email;

}
