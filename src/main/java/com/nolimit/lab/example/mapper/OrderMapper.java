public interface OrderMapper {
    
    @Select("SELECT * FROM orders")
    List<Order> getAll(@Param("offset") int offset, @Param("maxResults") int maxResults);


    @Select("SELECT * FROM orders")
    List<Order> listOrder();
    
    @Select("SELECT * FROM orders")
    PageDTO<Order> findOrderByPage(Map<String, Object> param);

    Long totalNumber();
}
