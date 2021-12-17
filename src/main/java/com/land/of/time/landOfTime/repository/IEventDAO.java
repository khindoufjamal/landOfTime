package com.land.of.time.landOfTime.repository;

import com.land.of.time.landOfTime.domain.Association;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEventAssociationDAO extends JpaRepository<Long, Association> {
}
