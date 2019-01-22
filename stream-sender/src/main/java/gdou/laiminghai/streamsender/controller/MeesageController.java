package gdou.laiminghai.streamsender.controller;

import gdou.laiminghai.streamsender.service.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeesageController {

    @Autowired
    private MessageSender messageSender;

    @PostMapping("/send")
    public String send(@RequestParam String message){
        messageSender.send(message);
        return "";
    }
}
