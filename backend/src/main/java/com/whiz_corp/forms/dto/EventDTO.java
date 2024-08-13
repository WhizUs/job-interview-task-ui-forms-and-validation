package com.whiz_corp.forms.dto;

import java.util.Date;

public class EventDTO {
  private String type;
  private String title;
  private String description;
  private Date startDate;
  private Date endDate;
  private int numberOfAttendees;
  private int locationId;
  private String locationDirection;
  
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }
  public int getNumberOfAttendees() {
    return numberOfAttendees;
  }
  public void setNumberOfAttendees(int numberOfAttendees) {
    this.numberOfAttendees = numberOfAttendees;
  }
  public int getLocation() {
    return locationId;
  }
  public void setLocation(int locationId) {
    this.locationId = locationId;
  }
  public String getLocationDirection() {
    return locationDirection;
  }
  public void setLocationDirection(String locationDirection) {
    this.locationDirection = locationDirection;
  }
  @Override
  public String toString() {
    return "EventDTO [type=" + type + ", title=" + title + ", description=" + description + ", startDate=" + startDate
        + ", endDate=" + endDate + ", numberOfAttendees=" + numberOfAttendees + ", locationId=" + locationId
        + ", locationDirection=" + locationDirection + "]";
  }
  
}
