package com.nolimit.lab.example.service.impl;

import com.nolimit.lab.example.service.PaymentService;

@RequestMapping("/payments")
public class PaymentServiceImpl implements PaymentService {

    private static final int DEFAULT_PAYMENT_METHOD = 0;

    @RequestMapping("/list")
    public List<PaymentOrder> listPaymentOrder(@RequestBody PaymentOrderDTO paymentOrderDTO) {

    }
}
