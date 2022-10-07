
public class OrderServiceImpl implements OrderService {

    @Resource
    private IOrderDAO orderDAO;

    @Resource
    private OrderMapper orderMapper;

		@Override
    public List<Order> listOrder() {
        
        OrderFilter orderFilter = new OrderFilter();
        return orderMapper.listOrder(OrderFilter);
    }
    
    public Order getById(Long id) {
    	   return orderMapper.getById(id);
    }
    
    
}
