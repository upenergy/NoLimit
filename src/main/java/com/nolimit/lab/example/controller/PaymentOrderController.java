

@RestController
@RequestMapping("/paymentOrder")
public PaymentOrderController extends BaseController {

    @Resource
    private PaymentOrderService paymentOrderService;

	@RequestMapping(value = "/payments/list", method = RequestMethod.GET)
    public PageDTO<PaymentOrder> listPaymentOrder(@RequestBody PaymentOrderDTO paymentOrderDTO) {
        return paymentOrderService.listOrder(paymentOrderDTO);
    }
    


    @RequestMapping(value = "/payments/{id}")
    public PaymentOrder getById(@PathVariable("id") Long paymentId) {
        return paymentOrderService.getById(paymentId);
    }
}