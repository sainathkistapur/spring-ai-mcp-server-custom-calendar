package dev.springai.mcp.server.custom.calendar.config;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import dev.springai.mcp.server.custom.calendar.domain.CalendarEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.InputStream;
import java.util.List;

@Configuration
@Slf4j
public class DataInitConfig {

    @Bean
    public List<CalendarEvent> calendarEvents() throws Exception {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            TypeReference<List<CalendarEvent>> typeReference = new TypeReference<List<CalendarEvent>>(){};
            InputStream inputStream = TypeReference.class.getResourceAsStream("/data/calendar-events.json");
            List<CalendarEvent> calendarEvents = mapper.readValue(inputStream,typeReference);

            log.info("Total calendar events loaded:", calendarEvents.size());

            return calendarEvents;
        } catch (Exception e) {
            log.error("error : {}", e.getMessage());
            throw e;
         }

    }
}
