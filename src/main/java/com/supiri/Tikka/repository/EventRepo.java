package com.supiri.Tikka.repository;

import com.supiri.Tikka.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepo extends JpaRepository <Event, String> {
}
