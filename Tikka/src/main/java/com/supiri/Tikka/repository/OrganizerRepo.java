package com.supiri.Tikka.repository;

import com.supiri.Tikka.model.Organizer;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizerRepo extends JpaRepository <Organizer,Integer>{

}
