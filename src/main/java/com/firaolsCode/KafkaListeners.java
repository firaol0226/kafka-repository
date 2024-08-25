package com.firaolsCode;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class KafkaListeners {
    @KafkaListener(topics ="firaolsCodeTopic", groupId = "groupId")
    void listener (String data){
        System.out.println("Listener Received: "+ data+"-"+ LocalDateTime.now());
    }
}
