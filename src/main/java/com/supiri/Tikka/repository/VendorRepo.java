package com.supiri.Tikka.repository;

import com.supiri.Tikka.model.Vendors;
import com.supiri.Tikka.model.Vendors;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepo extends JpaRepository <Vendors,Integer>{

}
