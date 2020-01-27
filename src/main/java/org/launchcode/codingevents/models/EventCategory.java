package org.launchcode.codingevents.models;

import javax.persistence.Entity;

@Entity
public class EventCategory extends AbstractEntity{

    private String name;

    public EventCategory(String name) {
        this.name= name;
    }

    public EventCategory() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
