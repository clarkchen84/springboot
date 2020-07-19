package sizhe.chen.spring.boot.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sizhe.chen.spring.boot.demo.entity.User;
import sizhe.chen.spring.boot.demo.repository.UserRepository;

/**
 * @ClassName : UserController
 * @Description :
 * @Author : Clark Chen
 * @Date: 2020-07-19 12:30
 */
@Api
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @ApiOperation(value = "根据id获取用户信息")
    @GetMapping("/{id}")
    public User get(@PathVariable int id) {
        return userRepository.findById(id).get();
    }

    @ApiOperation(value = "创建用户")
    @PostMapping("")
    public User create(@RequestBody User user) {
        return userRepository.save(user);
    }

    @ApiOperation(value = "更新用户")
    @PutMapping("")
    public User update(@RequestBody User user) {
        return userRepository.save(user);
    }

    @ApiOperation(value = "删除用户")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        userRepository.deleteById(id);
    }
}
