package com.land.of.time.landOfTime.rest;

import com.land.of.time.landOfTime.domain.Association;
import com.land.of.time.landOfTime.repository.IAssociationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
public class AssociationRestService {
@Autowired
IAssociationDAO associationDAO;


    @GetMapping("/associations")
    public Flux<Association> getAssociations() {
        return associationDAO.getAllAssociations();
    }

    @GetMapping("/association/{id}")
    public Mono<Association> findById(@PathVariable int id) {
        return this.associationDAO.getAssociationById(id);
    }
    @PostMapping("/user")
    Mono<Void> create(@RequestBody Mono<Association> associationStream) {
            return this.associationDAO.saveAssociation(associationStream).then();
    }

}
