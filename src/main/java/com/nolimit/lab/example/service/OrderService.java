
@Service
public interface OrderService {

    List<Order> listOrder();
    
    Order getById();
    
    List<Order> getOrderByPage(Long start, Integer pageSize, OrderDTO order);
}
