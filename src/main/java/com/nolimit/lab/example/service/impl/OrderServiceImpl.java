
public class OrderServiceImpl implements OrderService {

    @Resource
    private IOrderDAO orderDAO;

    @Resource
    private OrderMapper orderMapper;

    public List<Order> listOrder() {
        
        OrderFilter orderFilter = new OrderFilter();
        return orderMapper.listOrder(OrderFilter);
    }
}
