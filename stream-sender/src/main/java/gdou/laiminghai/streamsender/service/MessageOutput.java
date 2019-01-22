package gdou.laiminghai.streamsender.service;


import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;

public interface MessageOutput {
    String OUTPUT = "input";

    @Output(MessageOutput.OUTPUT)
    MessageChannel output();
}
