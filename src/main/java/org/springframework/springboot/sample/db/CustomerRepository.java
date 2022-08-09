package org.springframework.springboot.sample.db;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.springboot.sample.model.Customer;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CustomerRepository extends Repository<Customer, Integer> {

    @Query(value = "SELECT * FROM CUSTOMER", nativeQuery = true)
    @Transactional(readOnly = true)
    List<Customer> getAllCustomers();
}
