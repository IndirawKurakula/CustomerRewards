package com.base.retail.service;

import com.base.retail.model.Rewards;
public interface RewardsService {
    public Rewards getRewardsByCustomerId(Long customerId);
}
