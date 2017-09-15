package com.dataart.edu.model.dto;

/**
 * Created by akuzmenko on 3/20/2017.
 */
public class RoomSearchCriteria {
    private Boolean hasTv;
    private Boolean hasBalcony;
    private Boolean hasAirCond;

    public Boolean getHasTv() {
        return hasTv;
    }

    public void setHasTv(Boolean hasTv) {
        this.hasTv = hasTv;
    }

    public Boolean getHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(Boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public Boolean getHasAirCond() {
        return hasAirCond;
    }

    public void setHasAirCond(Boolean hasAirCond) {
        this.hasAirCond = hasAirCond;
    }
}
