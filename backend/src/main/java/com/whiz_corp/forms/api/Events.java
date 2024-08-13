package com.whiz_corp.forms.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whiz_corp.forms.dto.EventDTO;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/events")
public class Events {
  /**
   * Create a new event
   * @param entity
   * @return
   */
  @PostMapping("")
  public void createEvent(@RequestBody EventDTO event) {
    System.out.println(event);
  }
 
}
