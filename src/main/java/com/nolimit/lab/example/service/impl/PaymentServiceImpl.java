package com.nolimit.lab.example.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.PageDTO;
import com.nolimit.lab.example.service.PaymentService;


public class PaymentServiceImpl implements PaymentService extends BaseService {

    private static final int DEFAULT_PAYMENT_METHOD = 0;

    
    public PageDTO<PaymentOrder> listPaymentOrder(@RequestBody PaymentOrderDTO paymentOrderDTO) {

        List<PaymentOrder> paymentOrderList = null;
        return new PageDTO<PaymentOrder>();
    }

}
