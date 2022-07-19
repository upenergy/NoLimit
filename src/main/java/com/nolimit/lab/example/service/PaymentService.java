package com.nolimit.lab.example.service;

import org.springframework.stereotype.Service;

@Service
public interface PaymentService {

	
    PageDTO<PaymentOrder> listPaymentOrder(@RequestBody PaymentOrderDTO paymentOrderDTO);

    PaymentOrder getById(@PathVariable("id") PaymentOrderDTO paymentOrderDTO);
}
