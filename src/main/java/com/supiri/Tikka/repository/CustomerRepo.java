package com.supiri.Tikka.repository;

import com.supiri.Tikka.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository <Customer, String> {
}
