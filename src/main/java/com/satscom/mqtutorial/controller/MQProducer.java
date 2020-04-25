package com.satscom.mqtutorial.controller;

/*
* @author : Sathish Krishnan
*  Date : April 19 2020
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;

@RestController
public class MQProducer {

    @Autowired
    JmsTemplate jmsTemplate;

    @Autowired
    Queue queue;

    @GetMapping("/publish/{message}")
    public String getMessage(@PathVariable("message") final String message) {
        jmsTemplate.convertAndSend(queue,message);
        return "Message Submitted";

    }


}
