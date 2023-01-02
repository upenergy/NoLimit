public class WebConfig extends WebMvcConfigurerAdapter {
    @Autowired
    private NoLimitInterceptor interceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor);
    }
}
