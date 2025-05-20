package dev.springai.mcp.server.custom.calendar.config;

import dev.springai.mcp.server.custom.calendar.tooling.CalendarEventsTools;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@RequiredArgsConstructor
public class McpServerConfig {

    private final CalendarEventsTools calendarEventsTools;

    @Bean
    public ToolCallbackProvider calendarEventsToolsCallback() {
        return MethodToolCallbackProvider.builder().toolObjects(calendarEventsTools).build();
    }
}
