1) Download Apache ActiveMQ Artemis
    http://activemq.apache.org/components/artemis/download/
2) Create Broker like below
     apache-artemis-2.11.0/bin$ ./artemis create ../../broker
3) Start the broker running below command         
               ./artemis run
4) Admin console runs on localhost:8161

5) Compile Spring Boot project and run localhost:8080/publish/{message}

6) Spring boot publish and consume messages using JMSTemplate               