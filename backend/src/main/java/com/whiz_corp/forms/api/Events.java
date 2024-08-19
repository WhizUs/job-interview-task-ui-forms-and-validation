package com.whiz_corp.forms.api;

import org.springframework.web.bind.annotation.RestController;

import com.whizcorp.forms.generatedApi.EventsApi;
import com.whizcorp.forms.model.Event;

import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;

import org.springframework.http.ResponseEntity;

@RestController
public class Events implements EventsApi {
  private static final List<Event> events = new ArrayList<>();

  static {
    events.add(new Event());
    events.get(0).setTitle("Test Event");
    events.get(0).setDescription("This is a test event to test out the new software.");
    events.get(0).setStartDate(OffsetDateTime.parse("2024-08-28T10:43:27.621476208Z"));
    events.get(0).setEndDate(OffsetDateTime.parse("2024-08-30T10:43:27.621476208Z"));
    events.get(0).setType(Event.TypeEnum.EVENT);
    events.get(0).setLocationId(1);
    events.get(0).setNumberOfAttendees(150);
    events.get(0).setLocationDirection("At the main entrance");

    events.add(new Event());
    events.get(1).setTitle("Test Meeting");
    events.get(1).setDescription("This is a test meeting to test out the new software in very detail before the test event.");
    events.get(1).setStartDate(OffsetDateTime.parse("2024-08-19T10:43:27.621476208Z"));
    events.get(1).setEndDate(OffsetDateTime.parse("2024-08-20T10:43:27.621476208Z"));
    events.get(1).setType(Event.TypeEnum.MEETING);
    events.get(1).setLocationId(2);
    events.get(1).setNumberOfAttendees(8);
    events.get(1).setLocationDirection("Go to the second floor and after the first toilet take a left.");
  }

  @Override
  public ResponseEntity<List<Event>> apiEventsGet() {
    return ResponseEntity.ok(events);
  }

  @Override
  public ResponseEntity<Event> apiEventsPost(Event event) {
    events.add(event);
    return ResponseEntity.ok(event);
  }
 
}
