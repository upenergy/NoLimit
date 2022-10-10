package com.nolimit.lab.example.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.PageDTO;
import com.nolimit.lab.example.service.PaymentService;

public class PaymentOrderServiceImpl implements PaymentOrderService extends BaseService {

    private static final int DEFAULT_PAYMENT_METHOD = 0;

    @Resource
    private PaymentOrderMapper paymentOrderMapper;
    
    public PageDTO<PaymentOrder> listPaymentOrder(@RequestBody PaymentOrderDTO paymentOrderDTO) {

        List<PaymentOrder> paymentOrderList = null;
        return paymentOrderMapper.getOrderList(paymentOrderDTO);
    }


    public PaymentOrder getById(@PathVariable("id") PaymentOrderDTO paymentOrderDTO){
        PaymentOrder paymentOrder = null;
        return new PaymentOrder();
    }
}
