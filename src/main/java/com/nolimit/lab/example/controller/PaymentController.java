

@RestController
@RequestMapping("/payment")
public PaymentController extends BaseController {

	@RequestMapping(value = "/payments/list")
    public PageDTO<PaymentOrder> listPaymentOrder(@RequestBody PaymentOrderDTO paymentOrderDTO) {

    }
    


    @RequestMapping(value = "/payments/{id}")
    public PaymentOrder getById(@PathVariable("id") PaymentOrderDTO paymentOrderDTO) {

    }
}