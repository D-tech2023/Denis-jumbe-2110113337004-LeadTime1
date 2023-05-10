package com.LeadTime.Repo;

import models.leadtime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LeadRepo extends JpaRepository<leadtime,String> {
    void delete(Optional<leadtime> deleteleadtime);
}
