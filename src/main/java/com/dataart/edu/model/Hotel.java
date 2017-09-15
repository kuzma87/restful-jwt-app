package com.dataart.edu.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by akuzmenko on 2/28/2017.
 */
@Entity
public class Hotel {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Boolean hasPool;
    private Boolean hasSlides;
    private Boolean hasTennis;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "hotelId", nullable = false)
    private Set<Room> rooms;

    public Hotel() {
    }

    public Hotel(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getHasPool() {
        return hasPool;
    }

    public void setHasPool(Boolean hasPool) {
        this.hasPool = hasPool;
    }

    public Boolean getHasSlides() {
        return hasSlides;
    }

    public void setHasSlides(Boolean hasSlides) {
        this.hasSlides = hasSlides;
    }

    public Boolean getHasTennis() {
        return hasTennis;
    }

    public void setHasTennis(Boolean hasTennis) {
        this.hasTennis = hasTennis;
    }

    public Set<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Set<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
