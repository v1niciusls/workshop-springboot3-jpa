package com.viniciusls.course.resources;

import com.viniciusls.course.services.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/items")
public class OrderItemResource {
    @Autowired
    private OrderItemService orderItemService;

}
