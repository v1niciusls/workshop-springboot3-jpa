package com.viniciusls.course.config;

import com.viniciusls.course.entities.Order;
import com.viniciusls.course.entities.User;
import com.viniciusls.course.entities.enums.OrderStatus;
import com.viniciusls.course.repositories.OrderRepository;
import com.viniciusls.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;


    User u1 = new User(null, "vinicius", "vinicius@gmail.com", "977888888", "123456");
    User u2 = new User(null, "chico Green", "chico@gmail.com", "977777799", "123456");

    Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),u1, OrderStatus.PAID);
    Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2,OrderStatus.WAITING_PAYMENT);
    Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1,OrderStatus.WAITING_PAYMENT);


    @Override
    public void run(String... args) throws Exception {
        userRepository.saveAll(Arrays.asList(u1,u2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));
    }





}
