
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    public List<Order> listOrder() {
        
        OrderFilter orderFilter = new OrderFilter();
        return orderMapper.listOrder(OrderFilter);
    }

    public Order getById(Long orderId) {
        return orderMapper.findById(orderId);
    }

    public PageDTO<Order> getOrderByPage(OrderFilter orderFilter, Integer page, Integer pageSize) {
        
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("page", (page-1)*size);
        params.put("size", size);
        PageDTP<Order> page = new PageDTO<Order>();
        List<Order> orderList = orderMapper.findOrderByPage(orderFilter， params);
        page.setRows(orderList);
        page.setTotal();
        return page;
    }
}
