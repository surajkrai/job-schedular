package com.jarus.job_schedular;

import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    public void sendMessage() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Sending Message "+ i);
        }

    }
}
