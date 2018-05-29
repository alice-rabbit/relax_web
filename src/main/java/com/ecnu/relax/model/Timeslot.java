package com.ecnu.relax.model;

public class Timeslot {
    private Integer timeslotId;

    private String concreteTime;

    public Integer getTimeslotId() {
        return timeslotId;
    }

    public void setTimeslotId(Integer timeslotId) {
        this.timeslotId = timeslotId;
    }

    public String getConcreteTime() {
        return concreteTime;
    }

    public void setConcreteTime(String concreteTime) {
        this.concreteTime = concreteTime == null ? null : concreteTime.trim();
    }
}