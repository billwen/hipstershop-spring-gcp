package com.billwen.hipstershopfrontend.repo;

import com.billwen.hipstershopfrontend.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByAccountName(String accountName);
}
