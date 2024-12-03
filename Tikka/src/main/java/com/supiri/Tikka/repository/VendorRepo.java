package com.supiri.Tikka.repository;

import com.supiri.Tikka.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepo extends JpaRepository <Vendor, Integer> {
}
