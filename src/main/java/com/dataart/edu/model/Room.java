package com.dataart.edu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by akuzmenko on 3/6/2017.
 */
@Entity
public class Room {

    @Id
    @GeneratedValue
    private Long id;
    private Integer type;
    private Integer view;
    private Boolean hasTv;
    private Boolean hasBalcony;
    private Boolean hasAirCond;
    @Column(insertable = false, updatable = false)
    private Long hotelId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RoomType getType() {
        return RoomType.getType(type);
    }

    public void setType(RoomType type) {
        this.type = type.getId();
    }

    public RoomView getView() {
        return RoomView.getView(view);
    }

    public void setView(RoomView view) {
        this.view = view.getId();
    }

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

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }
}
