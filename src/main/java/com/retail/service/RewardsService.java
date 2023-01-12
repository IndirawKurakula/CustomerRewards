package com.retail.service;

import com.retail.model.Rewards;
public interface RewardsService {
    public Rewards getRewardsByCustomerId(Long customerId);
}
