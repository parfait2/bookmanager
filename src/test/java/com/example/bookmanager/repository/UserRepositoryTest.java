package com.example.bookmanager.repository;

import com.example.bookmanager.domain.User;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void crud() {
        /**
         * test 1
         * */
        /*
        userRepository.save(new User());
        userRepository.findAll().forEach(System.out::println);

//        for(User user : userRepository.findAll()) {
//            System.out.println(user);
//        }

         */

        /**
         * test 2
         * */
        /*
//        List<User> users = userRepository.findAll(Sort.by(Sort.Direction.DESC, "name"));
        List<User> users = userRepository.findAllById(Lists.newArrayList(1L, 3L, 5L));
        users.forEach(System.out::println);
         */

        /**
         * test 3
         * */
        User user1 = new User("minho", "dopaminho@naver.com");
        User user2 = new User("haejun", "haejunkim@metacomedy.net");

//        userRepository.saveAll(Lists.newArrayList(user1, user2));
        userRepository.save(user1);

        List<User> users = userRepository.findAll();

        users.forEach(System.out::println);
    }
}