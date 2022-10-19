public interface PaymentOrderMapper {
    
    @Select("SELECT * FROM payment_order")
    List<PaymentOrder> getAll();

    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert("INSERT INTO payment_order (out_trade_no, order_number, version, created_at) VALUES (#{paymentOrder.outTradeNo}, #{paymentOrder.orderNumber}, #{paymentOrder.version}, #{paymentOrder.createdAt})")
    void insert(@Param("paymentOrder") PaymentOrder paymentOrder);

    @Select("SELECT * FROM payment_order")
    List<PaymentOrder> getOrderList(PaymentOrderDTO paymentOrderDTO);


    PaymentOrder update(@Param("paymentOrder") PaymentOrder paymentOrder);
}
