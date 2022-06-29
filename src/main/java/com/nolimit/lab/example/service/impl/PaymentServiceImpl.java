package com.nolimit.lab.example.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.PageDTO;
import com.nolimit.lab.example.service.PaymentService;

@RequestMapping("/payments")
public class PaymentServiceImpl implements PaymentService {

    private static final int DEFAULT_PAYMENT_METHOD = 0;

    @RequestMapping("/list")
    public PageDTO<PaymentOrder> listPaymentOrder(@RequestBody PaymentOrderDTO paymentOrderDTO) {

        List<PaymentOrder> paymentOrderList = null;
        if(){

        }

        return new PageDTO<PaymentOrder>();
    }
}
