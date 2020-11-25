package com.liveproject.simulatecustomer.repository;

import com.liveproject.simulatecustomer.model.Transaction;

public interface MerchantDetailsRepository {
    Transaction addMerchantLogo(Transaction merchantName);
}
