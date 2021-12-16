package com.land.of.time.landOfTime.domain;

import javax.persistence.*;

@Entity
public class Event {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name = "association_id")
    Association association;

    public Association getAssociation() {
        return association;
    }

}
