package gdou.laiminghai.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class FromController {

    @Value("${from}")
    private String from;

    @Value("${from-profile}")
    private String fromProfile;

    @RequestMapping("/from")
    public String from() {
        return this.from + ":" + this.fromProfile;
    }

}
