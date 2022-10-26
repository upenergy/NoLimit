
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


}