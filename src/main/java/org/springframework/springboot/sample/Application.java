package org.springframework.springboot.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class Application {
    private final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Transactional
    @EventListener(ApplicationReadyEvent.class)
    public void runAfterStartup() {
        logger.info("Service Started");

        //        List<Customer> allCustomers = repository.getAllCustomers();
        //        try {
        //            System.err.println(objectMapper.writeValueAsString(allCustomers));
        //        } catch (JsonProcessingException e) {
        //            e.printStackTrace();
        //        }
    }
}
