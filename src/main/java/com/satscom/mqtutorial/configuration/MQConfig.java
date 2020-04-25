package com.satscom.mqtutorial.configuration;

import org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory;
import org.apache.activemq.artemis.jms.client.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;
import javax.jms.JMSException;
import javax.jms.Queue;

/*
 * @author : Sathish Krishnan
 *  Date : April 19 2020
 */

@Configuration
public class MQConfig  {

    @Value("${activemq.broker-url}")
    private String brokerUrl;

    @Value("${activemq.queue-name}")
    private String queueName;

    @Bean
    public Queue queue() {
        return new ActiveMQQueue(queueName);
    }

    @Bean
    public ActiveMQConnectionFactory activeMQConnectionFactory() throws JMSException {
        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory();
        factory.setBrokerURL(brokerUrl);
        return factory;
    }

    @Bean
    public JmsTemplate jmsTemplate () throws JMSException {
        return new JmsTemplate(activeMQConnectionFactory());
    }



}
