package com.licerlee.elasticsearchdemo.repository;

import com.licerlee.elasticsearchdemo.domain.UserEntity;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    void findByNameAndAge() {
        List<UserEntity> users = userRepository.findByNameAndAge("liwc", 18);
        System.out.println("users.size() = " + users.size());

    }
}