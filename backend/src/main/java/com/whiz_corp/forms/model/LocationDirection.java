package com.whiz_corp.forms.model;

public class LocationDirection {
  private static int nextId = 1;

  private int id;
  private String direction;

  public LocationDirection(String direction) {
    this.id = LocationDirection.nextId++;
    this.direction = direction;
  }

  public static int getNextId() {
    return nextId;
  }

  public static void setNextId(int nextId) {
    LocationDirection.nextId = nextId;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  @Override
  public String toString() {
    return "LocationDirection [id=" + id + ", direction=" + direction + "]";
  }

}
