package com.whiz_corp.forms.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whizcorp.forms.generatedApi.LocationsApi;
import com.whizcorp.forms.model.Location;
import com.whizcorp.forms.model.LocationDirection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class Locations implements LocationsApi {

  private static final List<Location> locations = new ArrayList<>();
  private static final Map<Integer, LocationDirection> locationDirections = new HashMap<>();

  static {
    locations.add(new Location());
    locations.get(0).setId(1);
    locations.get(0).setName("Hall");
    locations.get(0).setCapacity("200");
    locations.get(0).setDefaultDirectionId(1);

    locations.add(new Location());
    locations.get(1).setId(2);
    locations.get(1).setName("Meeting Room 1");
    locations.get(1).setCapacity("25");
    locations.get(1).setDefaultDirectionId(2);

    locations.add(new Location());
    locations.get(2).setId(3);
    locations.get(2).setName("Meeting Room 2");
    locations.get(2).setCapacity("8");
    locations.get(2).setDefaultDirectionId(3);

    locations.add(new Location());
    locations.get(3).setId(4);
    locations.get(3).setName("Meeting Room 3");
    locations.get(3).setCapacity("10");
    locations.get(3).setDefaultDirectionId(4);

    locations.add(new Location());
    locations.get(4).setId(5);
    locations.get(4).setName("Meeting Room 4");
    locations.get(4).setCapacity("4");
    locations.get(4).setDefaultDirectionId(5);

    locations.add(new Location());
    locations.get(5).setId(6);
    locations.get(5).setName("Meeting Room 5");
    locations.get(5).setCapacity("5");
    locations.get(5).setDefaultDirectionId(6);

    locationDirections.put(1, new LocationDirection());
    locationDirections.get(1).setId(1);
    locationDirections.get(1).setDirection("At the entrance");

    locationDirections.put(2, new LocationDirection());
    locationDirections.get(2).setId(2);
    locationDirections.get(2).setDirection("1. floor east");

    locationDirections.put(3, new LocationDirection());
    locationDirections.get(3).setId(3);
    locationDirections.get(3).setDirection("1. floor south");

    locationDirections.put(4, new LocationDirection());
    locationDirections.get(4).setId(4);
    locationDirections.get(4).setDirection("2. floor west");

    locationDirections.put(5, new LocationDirection());
    locationDirections.get(5).setId(5);
    locationDirections.get(5).setDirection("2. foor north");

    locationDirections.put(6, new LocationDirection());
    locationDirections.get(6).setId(6);
    locationDirections.get(6).setDirection("2. floor south");
  }

  @Override
  public ResponseEntity<LocationDirection> apiLocationsDirectionIdGet(Integer id) {
    if (locationDirections.containsKey(id)) {
      return ResponseEntity.ok(locationDirections.get(id));
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  @Override
  public ResponseEntity<List<Location>> apiLocationsGet() {
    return ResponseEntity.ok(locations);
  }

  @Override
  public ResponseEntity<Location> apiLocationsIdGet(Integer id) {
    if (id < 1 || id > locations.size()) {
      return ResponseEntity.notFound().build();
    } else {
      return ResponseEntity.ok(locations.get(id - 1));
    }
  }  
}
