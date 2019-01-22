package gdou.laiminghai.streamreceiver.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;

@EnableBinding(Sink.class)
public class MessageReceiver {

    @Value("${spring.cloud.stream.instance-index}")
    private int partition;

    @StreamListener(Sink.INPUT)
    public void receiver(Message<String> message){
        System.out.println("分区" + partition + "，接收到消息：" + message.getPayload());
    }

}
