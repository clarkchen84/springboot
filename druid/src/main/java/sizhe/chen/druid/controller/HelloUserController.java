package sizhe.chen.druid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sizhe.chen.druid.mapper.UserMapper;
import sizhe.chen.druid.model.User;
import sizhe.chen.druid.model.UserExample;

/**
 * @ClassName : HelloUser
 * @Description :
 * @Author : Clark Chen
 * @Date: 2020-07-22 22:04
 */
@RequestMapping("/hello")
@RestController
public class HelloUserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user/{id}")
    public String getUserName(@PathVariable Integer id){
        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdEqualTo(id);
        User user = userMapper.selectByExample(userExample).get(0);
        return user.getName();
    }

    @PostMapping("")
    public String getUserName(@RequestBody  User  User){
        userMapper.insert(User);
        return "sucess";
    }


}
