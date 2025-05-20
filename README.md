# Spring AI MCP Server for Custom Calendar Events

Application to demonstrate the Spring AI implementation for the MCP server for LLM's to fetch your custom calendar events. 

This application currently uses only local json file to store the testing calendar events under
`resources/data/calendar-events.json` file.
Eventually this will be enhanced to other calendar organisers like Google Calendar, Outlook etc. 

Offers the following of MCP tooling:
- Get list of calendar events based on the given date.

Calendar event types could be TRAVEL, MEETING etc.

## Running the Application

### Run Command
```
mvn spring-boot:run
```

### How the application works:

The application is providing MCP SSE server capabilities for the clients using HTTP (WebMvc) protocol.

The SSE endpoint is: `http://localhost:8081`


