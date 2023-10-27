package com.example.bookmanager.repository;

import com.example.bookmanager.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;

import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.contains;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.endsWith;

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
        /*
        User user1 = new User("minho", "dopaminho@naver.com");
        User user2 = new User("haejun", "haejunkim@metacomedy.net");

//        userRepository.saveAll(Lists.newArrayList(user1, user2));
        userRepository.save(user1);

        List<User> users = userRepository.findAll();

        users.forEach(System.out::println);
         */

        /**
         * test 4
         * */
        /*
//        userRepository.save(new User("new Minho", "newminho@naver.com"));
//        userRepository.flush();

        userRepository.saveAndFlush(new User("new Minho", "newminho@naver.com"));

        userRepository.findAll().forEach(System.out::println);
         */

        /**
         * test 5
         * */
        /*
//        long count = userRepository.count();
//        System.out.println(count);

//        boolean exists = userRepository.existsById(1L);
//        System.out.println(exists);

//        userRepository.delete(userRepository.findById(1L).orElseThrow(RuntimeException::new));

//        userRepository.deleteById(1L);
//        userRepository.findAll().forEach(System.out::println);

        userRepository.deleteInBatch(userRepository.findAllById(Lists.newArrayList(1L, 3L)));
        userRepository.findAll().forEach(System.out::println);
         */

        /**
         * test 6
         * paging
         * e.g. Blog
         * */
//        Page<User> users = userRepository.findAll(PageRequest.of(1, 3));
//
//        System.out.println("page : " + users);
//        System.out.println("totalElements : " + users.getTotalElements());
//        System.out.println("totalPages : " + users.getTotalPages());
//        System.out.println("numberOfElements : " + users.getNumberOfElements());
//        System.out.println("sort : " + users.getSort());
//        System.out.println("size : " + users.getSize());
//
//        users.getContent().forEach(System.out::println);

        /**
         * test 7
         * QBE
         * */
//        ExampleMatcher matcher = ExampleMatcher.matching()
//                .withIgnorePaths("name")
//                .withMatcher("email", endsWith());
//
//        Example<User> example = Example.of(new User("mi", "metacomedy.net"), matcher);
//
//        userRepository.findAll(example).forEach(System.out::println);


        User user = new User();
        user.setEmail("naver");

        ExampleMatcher matcher = ExampleMatcher.matching().withMatcher("email", contains());
        Example<User> example = Example.of(user, matcher);

        userRepository.findAll(example).forEach(System.out::println);
    }
}