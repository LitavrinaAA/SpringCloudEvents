package ru.litavrina.Events.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.litavrina.Events.model.Event;
import ru.litavrina.Events.service.EventService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/events")
public class EventsController {
    private final EventService eventService;
    @GetMapping
    public List<Event> getAll() {
        System.out.println("все вернуть");
        return eventService.getAll();
    }
    @PostMapping("/add")
    public Event addEvent(@RequestBody Event event) {
        System.out.println(event);
        return eventService.saveEvent(event);
    }
}
