package com.viniciusls.course.config;

import com.viniciusls.course.entities.User;
import com.viniciusls.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

    @Autowired
    private UserRepository userRepository;

    User u1 = new User(null, "vinicius", "vinicius@gmail.com", "977888888", "123456");
    User u2 = new User(null, "chico Green", "chico@gmail.com", "977777799", "123456");
    @Override
    public void run(String... args) throws Exception {
        userRepository.saveAll(Arrays.asList(u1,u2));
    }





}
