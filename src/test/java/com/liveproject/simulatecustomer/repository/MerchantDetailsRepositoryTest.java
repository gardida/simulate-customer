package com.liveproject.simulatecustomer.repository;

import com.liveproject.simulatecustomer.model.Transaction;
import com.liveproject.simulatecustomer.repository.MerchantDetailsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class MerchantDetailsRepositoryTest {

    @Autowired
    MerchantDetailsRepository merchantDetailsRepository;

    @Test
    public void testFindAllByAccountNumber() {
        final List<Transaction> accountTransactionList = List.of(
                new Transaction("Debit", "123", "GBP", BigDecimal.TEN, "Acme", ""),
                new Transaction("Debit", "456", "USD", BigDecimal.ONE, "Globex", ""));

        accountTransactionList.forEach(System.out::println);

        System.out.println(merchantDetailsRepository);

        accountTransactionList.forEach(transaction -> merchantDetailsRepository.addMerchantLogo(transaction));

        accountTransactionList.forEach(System.out::println);

        assertEquals(2, 2);
    }
}