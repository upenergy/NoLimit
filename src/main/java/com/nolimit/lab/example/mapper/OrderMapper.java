public interface OrderMapper {
    
    @Select("SELECT * FROM orders")
    List<Order> getAll(@Param("offset") int offset, @Param("maxResults") int maxResults);
    
}
