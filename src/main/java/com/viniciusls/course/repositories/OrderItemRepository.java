package com.viniciusls.course.repositories;

import com.viniciusls.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {



}
