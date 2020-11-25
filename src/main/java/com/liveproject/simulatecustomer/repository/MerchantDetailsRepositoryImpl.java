package com.liveproject.simulatecustomer.repository;

import com.liveproject.simulatecustomer.model.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentHashMap;

@Repository
public class MerchantDetailsRepositoryImpl implements MerchantDetailsRepository {

    private final static ConcurrentHashMap<String, String> merchantNameLogoMap = new ConcurrentHashMap<>();
    static {
        merchantNameLogoMap.put("Acme", "acme-logo.png");
        merchantNameLogoMap.put("Globex", "globex-logo.jpg");
        merchantNameLogoMap.put("Morley", "morley-logo.jpg");
        merchantNameLogoMap.put("Contoso", "contoso-logo.jpg");
    }

    @Override
    public Transaction addMerchantLogo(Transaction transaction) {
        transaction.setMerchantLogo(merchantNameLogoMap.getOrDefault(transaction.getMerchantName(), "default-logo.jpg"));
        return transaction;
    }
}
