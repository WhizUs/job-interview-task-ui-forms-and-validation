package com.whiz_corp.forms.model;

public class Location {
  private static int nextId = 1;

  private int id;
  private String name;
  private int capacity;
  private int defaultDirectionId;

  public Location(String name, int capacity, int defaultDirectionId) {
    this.id = Location.nextId++;
    this.name = name;
    this.capacity = capacity;
    this.defaultDirectionId = defaultDirectionId;
  }

  public static int getNextId() {
    return nextId;
  }

  public static void setNextId(int nextId) {
    Location.nextId = nextId;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public int getDefaultDirectionId() {
    return defaultDirectionId;
  }

  public void setDefaultDirectionId(int defaultDirectionId) {
    this.defaultDirectionId = defaultDirectionId;
  }

  @Override
  public String toString() {
    return "Location [id=" + id + ", name=" + name + ", capacity=" + capacity + ", defaultDirectionId="
        + defaultDirectionId + "]";
  }
}
