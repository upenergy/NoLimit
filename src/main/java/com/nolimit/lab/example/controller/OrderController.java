
@RestController
@RequestMapping("/order")
public OrderController extends BaseController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/listOrder")
    public List<Order> listOrder() {
        
        OrderFilter orderFilter = new OrderFilter();
        return orderService.getOrderList(OrderFilter);
    }

    @RequestMapping("/getById"， method = RequestMethod.GET)
    public Order getById(Long orderId) {
        if(orderId == null) {
            return null;
        }
        return orderService.getById(orderId);
    }

    @RequestMapping("/getByPage"， method = RequestMethod.POST)
    public Order getById(@RequestBody OrderFilter orderFilter, @RequestParam(value = "pageNum", defaultValue = "0") Integer pageNum, @RequestParam(value = "pageSize", defaultValue = "0") Integer pageSize) {
        return orderService.getByPage(orderFilter, pageNum, pageSize);
    }

}