package sizhe.chen.spring.mybatis.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sizhe.chen.spring.mybatis.mapper.UserMapper;
import sizhe.chen.spring.mybatis.model.User;

/**
 * @ClassName : UserController
 * @Description :
 * @Author : Clark Chen
 * @Date: 2020-07-19 21:18
 */
@Api
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/{id}")
    public User get(@PathVariable int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @PostMapping
    public int create(@RequestBody User user) {
        return userMapper.insert(user);
    }

    @PutMapping
    public int update(@RequestBody User user) {
        return userMapper.updateByPrimaryKey(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        userMapper.deleteByPrimaryKey(id);
    }

}
