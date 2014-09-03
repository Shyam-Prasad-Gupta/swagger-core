package com.wordnik.swagger.models;

import com.wordnik.swagger.models.properties.Property;

import java.util.*;

public class ArrayModel implements Model {
  private Map<String, Property> properties;
  private String type;
  private String description;
  private Property items;

  public ArrayModel () {
    this.type = "array";
  }

  public ArrayModel description(String description) {
    this.setDescription(description);
    return this;
  }
  public ArrayModel items(Property items) {
    this.setItems(items);
    return this;
  }

  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  public Property getItems() {
    return items;
  }
  public void setItems(Property items) {
    this.items = items;
  }

  public Map<String, Property> getProperties() {
    return properties;
  }
  public void setProperties(Map<String, Property> properties) {
    this.properties = properties;
  }
}