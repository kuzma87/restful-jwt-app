package com.dataart.edu.model.dto;

/**
 * Created by akuzmenko on 3/20/2017.
 */
public class HotelSearchCriteria {
    private Boolean hasPool;
    private Boolean hasSlides;
    private Boolean hasTennis;

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
}
