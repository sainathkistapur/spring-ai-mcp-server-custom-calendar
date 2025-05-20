package dev.springai.mcp.server.custom.calendar.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Data
public class CalendarEvent {

     private int id;

     private LocalDate eventDate;

     private CalendarEventType eventType;

     private String details;


}
