package ru.litavrina.Events.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.litavrina.Events.model.Event;
import ru.litavrina.Events.repository.EventRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EventService {
    private final EventRepository eventRepository;
    public List<Event> getAll() {
        return eventRepository.findAll();
    }
    public Event saveEvent(Event event) {
        System.out.println(event);
        return eventRepository.save(event);
    }
}
