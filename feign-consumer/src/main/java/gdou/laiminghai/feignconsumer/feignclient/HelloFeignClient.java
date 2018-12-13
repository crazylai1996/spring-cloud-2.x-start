package gdou.laiminghai.feignconsumer.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("EUREKA-CLIENT")
public interface HelloFeignClient {

    @GetMapping("/hello")
    String hello();

}
