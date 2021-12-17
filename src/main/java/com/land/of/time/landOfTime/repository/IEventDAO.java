package com.land.of.time.landOfTime.repository;


import com.land.of.time.landOfTime.domain.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IEventDAO extends JpaRepository<Long, Event> {

    Mono<Event> getEventById(int id);

    Flux<Event> getAllEvents();

    Mono<Void> saveEvent(Mono<Event> association);
}
