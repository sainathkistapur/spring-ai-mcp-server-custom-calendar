package dev.springai.mcp.server.custom.calendar.service;

import dev.springai.mcp.server.custom.calendar.domain.CalendarEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class CalendarService {

    private final List<CalendarEvent> calendarEvents;

    public List<CalendarEvent> getCalendarEventsForTheDay(LocalDate date) {
        List<CalendarEvent>  events =  calendarEvents.stream().filter(calendarEvent ->
                calendarEvent.getEventDate().equals(date))
                .collect(Collectors.toList());

        events.stream().forEach(e -> {
            log.info("Event : {}", e.toString());
            log.info("Event Type : {}", e.getEventType());
            log.info("Event Date: {}", e.getEventDate());
            log.info("Event Details: {}", e.getDetails());
        });
        return events;
    }

}
