package gdou.laiminghai.streamsender.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;

import java.util.Random;

@EnableBinding(Source.class)
public class MessageSender {

    @Autowired
    private Source source;

    public void send(String message){
        int whichPart = new Random().nextInt(2);
        System.out.println("发送消息：" + message + ",发往分区：" + whichPart);
        source.output().send(MessageBuilder.withPayload(message).setHeader("whichPart", whichPart).build());
    }
}
