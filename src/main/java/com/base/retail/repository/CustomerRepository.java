package com.base.retail.repository;

import org.springframework.data.repository.CrudRepository;

import com.base.retail.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Long> {
    public Customer findByCustomerId(Long customerId);
}
