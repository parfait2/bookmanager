package com.example.bookmanager.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class UserTest {
    @Test
    void test() {
        User user = new User();
        user.setName("minho");
        user.setEmail("haejunkim@metacomedy.com");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

        User user1 = new User(null, "minho", "haejunkim@metacomedy.com", LocalDateTime.now(), LocalDateTime.now());
        User user2 = new User("minho", "haejunkim@metacomedy.com");

        User user3 = User.builder()
                .name("minho")
                .email("haejunkim@metacomedy.net")
                .build();

        System.out.println(user);
    }
}