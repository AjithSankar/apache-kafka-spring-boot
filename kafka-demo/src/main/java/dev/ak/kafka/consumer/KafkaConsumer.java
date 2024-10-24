package dev.ak.kafka.consumer;

import dev.ak.kafka.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    //@KafkaListener(topics = "ajith", groupId = "myGroup")
    public void consume(String message) {
        log.info("Consuming message from ajith topic: {} ", message);
    }

    @KafkaListener(topics = "ajith", groupId = "myGroup")
    public void consume(Student message) {
        log.info("Consuming message from ajith topic: {} ", message.toString());
    }
}
