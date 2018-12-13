package gdou.laiminghai.feignconsumer.controller;

import gdou.laiminghai.feignconsumer.feignclient.HelloFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private HelloFeignClient helloFeignClient;

    @GetMapping("/feign-consumer/hello")
    public String dc() {
        return helloFeignClient.hello();
    }
}
