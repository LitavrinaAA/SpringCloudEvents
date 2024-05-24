package ru.litavrina.Events.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.litavrina.Events.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
