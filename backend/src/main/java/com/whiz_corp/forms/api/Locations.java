package com.whiz_corp.forms.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whiz_corp.forms.model.Location;
import com.whiz_corp.forms.model.LocationDirection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/locations")
public class Locations {

  private static final List<Location> locations = new ArrayList<>();
  private static final Map<Integer, LocationDirection> locationDirections = Map.of(
    1, new LocationDirection("At the entrance"),
    2, new LocationDirection("1. floor east"),
    3, new LocationDirection("1. floor south"),
    4, new LocationDirection("2. floor west"),
    5, new LocationDirection("2. foor north"),
    6, new LocationDirection("2. floor south")
  );

  static {
    locations.add(new Location("Hall", 200, 1));
    locations.add(new Location("Meeting Room 1", 25, 2));
    locations.add(new Location("Meeting Room 2", 8, 3));
    locations.add(new Location("Meeting Room 3", 10, 4));
    locations.add(new Location("Meeting Room 4", 4, 5));
    locations.add(new Location("Meeting Room 5", 5, 6));
  }

  /**
   * Get all location names and their respective IDs
   * @return List<Location>
   */
  @GetMapping("")
  public List<Location> getAllLocations() {
    return locations;
  }

  /**
   * Get the location default directions
   * @param id The locationDirection ID
   * @return LocationDirection
   */
  @GetMapping("/direction/{id}")
  public ResponseEntity<LocationDirection> getLocationDirection(@PathVariable("id") int id) {
    if (!locationDirections.containsKey(id)) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<>(locationDirections.get(id), HttpStatus.OK);
  }
  
}
