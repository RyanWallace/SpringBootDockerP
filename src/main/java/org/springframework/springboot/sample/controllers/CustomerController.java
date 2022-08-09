package org.springframework.springboot.sample.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.springboot.sample.db.CustomerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CustomerController {

    private final CustomerRepository customerRepository;
    private ObjectMapper objectMapper;

    @GetMapping("/get-customers")
    public String getCustomers() {

        String customersList;

        try {
            customersList = objectMapper.writeValueAsString(customerRepository.getAllCustomers());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            customersList = "Something Went Wrong!";
        }

        return customersList;
    }
}
