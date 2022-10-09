public interface OrderMapper {
    
    @Select("SELECT * FROM orders")
    List<Order> getAll(@Param("offset") int offset, @Param("maxResults") int maxResults);
    
    @Select("SELECT * FROM orders")
    PageDTO<Order> listOrderByPage(Long start, Integer pageSize, OrderDTO order);
    
    @Select("SELECT * FROM orders WHERE id:=orderId")
    Order getById(Long orderId);
}
