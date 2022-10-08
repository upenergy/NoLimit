
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
    
    @Override
    public Order getById(Long id) {
    	   return orderMapper.getById(id);
    }
    
    @Override
    public List<Order> getOrderByPage(Long start, Integer pageSize, OrderDTO order) {
    		return orderMapper.listOrderByPage(start, pageSize, order);
    }
}
