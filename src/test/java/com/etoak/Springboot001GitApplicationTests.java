package com.etoak;

import com.etoak.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.Optional;

@SpringBootTest
class Springboot001GitApplicationTests {

    @Test
    void contextLoads() {
        User user = new User();
        user.setId(1);user.setUserName("张三");
        user.setCreateTime(new Date());
        user.setPassword("1234");
        System.out.println(123);
        Optional<User> optionalUser = Optional.of(user);
        /*optionalUser.ifPresent(new Consumer<User>() {
            @Override
            public void accept(User user) {

            }
        });*/
    }

}
