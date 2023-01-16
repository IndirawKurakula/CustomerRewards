package com.base.retail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.base.retail.entity.Customer;
import com.base.retail.model.Rewards;
import com.base.retail.repository.CustomerRepository;
import com.base.retail.service.RewardsService;

@RestController
@RequestMapping("/customers")
public class CustomerRewardsController {


    @Autowired
    RewardsService rewardsService;

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/{customerId}/rewards")
    public ResponseEntity<Rewards> getRewardsByCustomerId(@PathVariable(value = "customerId") Long customerId) {
        Customer customer = customerRepository.findByCustomerId(customerId);
        if (customer == null) {
            throw new RuntimeException("Invalid / Missing customer Id:" + customerId);
        }
        Rewards customerRewards = rewardsService.getRewardsByCustomerId(customerId);
        return new ResponseEntity<>(customerRewards, HttpStatus.OK);
    }

}
