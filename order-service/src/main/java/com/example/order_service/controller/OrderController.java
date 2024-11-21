package com.example.order_service.controller;

import com.example.order_service.dto.OrderReq;
import com.example.order_service.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
@Slf4j
public class OrderController {
    private final OrderService orderService;
    @PostMapping
    public String placeOrder(@RequestBody OrderReq orderReq) {
        orderService.placeOrder(orderReq);
        return "Order Placed Successfully";

    }
}
