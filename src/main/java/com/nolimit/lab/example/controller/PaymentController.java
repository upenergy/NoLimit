

@RestController
@RequestMapping("/payment")
public PaymentController extends BaseController {

	@RequestMapping(value = "/payments/list", method = RequestMethod.GET)
    public PageDTO<PaymentOrder> listPaymentOrder(@RequestBody PaymentOrderDTO paymentOrderDTO) {

    }
    


    @RequestMapping(value = "/payments/{id}")
    public PaymentOrder getById(@PathVariable("id") PaymentOrderDTO paymentOrderDTO) {

    }
}