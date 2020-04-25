package com.satscom.mqtutorial.consumer;

/*
 * @author : Sathish Krishnan
 *  Date : April 19 2020
 */

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MQConsumer {


  @JmsListener(destination = "${activemq.queue-name}")
   public void consumeMQMessage(String message){
      System.out.println("Received Message " + message);
  }

}
