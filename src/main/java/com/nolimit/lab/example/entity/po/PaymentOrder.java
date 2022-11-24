package com.nolimit.lab.example.entity.po;

import com.nolimit.lab.example.entity.OrderStatusEnum;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class PaymentOrder implements Serializable {

    private Long id;
    private String orderNum;
    private BigDecimal price;
    private String outTradeNo;
    private BigDecimal salePrice;
    private OrderStatusEnum orderStatus;


}
