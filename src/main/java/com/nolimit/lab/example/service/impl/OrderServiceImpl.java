
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    public List<Order> listOrder() {
        
        OrderFilter orderFilter = new OrderFilter();
        return orderMapper.listOrder(OrderFilter);
    }

    public PageDTO<Order> getOrderByPage(Integer page, Integer pageSize, ) {
        
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("page", (page-1)*size);
        params.put("size", size);
        PageDTP<Order> page = new PageDTO<Order>();
        List<Order> orderList = orderMapper.findOrderByPage(params);
        page.setRows(orderList);
        page.setTotal();
        return page;
    }
}
