package com.land.of.time.landOfTime.repository;

import com.land.of.time.landOfTime.domain.Association;
import org.springframework.data.jpa.repository.JpaRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IAssociationDAO extends JpaRepository<Long, Association> {


    Mono<Association> getAssociationById(int id);

    Flux<Association> getAllAssociations();

    Mono<Void> saveAssociation(Mono<Association> association);
}
