package gdou.laiminghai.ribbonconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/ribbon-consumer/hello")
    public String comsume(){
        return restTemplate.getForObject("http://EUREKA-CLIENT/hello",String.class);
    }
}
