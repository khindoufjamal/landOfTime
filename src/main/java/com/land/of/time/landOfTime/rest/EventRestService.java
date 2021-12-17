package com.land.of.time.landOfTime.rest;

import com.land.of.time.landOfTime.domain.Event;
import com.land.of.time.landOfTime.repository.IEventDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

    @RestController
    public class EventRestService {
        @Autowired
        IEventDAO eventDAO;


        @GetMapping("/events")
        public Flux<Event> getEvents() {
            return eventDAO.getAllEvents();
        }

        @GetMapping("/event/{id}")
        public Mono<Event> findById(@PathVariable int id) {
            return eventDAO.getEventById(id);
        }
        @PostMapping("/event")
        Mono<Void> create(@RequestBody Mono<Event> eventStream) {
            return eventDAO.saveEvent(eventStream).then();
        }

    }


