package dev.springai.mcp.server.custom.calendar.tooling;

import dev.springai.mcp.server.custom.calendar.domain.CalendarEvent;
import dev.springai.mcp.server.custom.calendar.service.CalendarService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CalendarEventsTools {

    private final CalendarService calendarService;

    @Tool(name = "getCalendarEventsByDate", description = "Get a the calendar event for the date")
    public List<CalendarEvent> getCalendarEventsByDate(LocalDate date) {
        return calendarService.getCalendarEventsForTheDay(date);
    }
}
