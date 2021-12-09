package com.example.banana;

import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.MappedProperty;

@MappedEntity(value = "bananas")
public class Banana {

    @Id
    private Long bananaId;

    private boolean isActive;

    @MappedProperty(value = "is_active")
    private boolean isVeryInteresting;

    private boolean is_active;

    @MappedProperty(value = "is_active")
    private boolean what;


    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isWhat() {
        return what;
    }

    public void setWhat(boolean what) {
        this.what = what;
    }

    public Long getBananaId() {
        return bananaId;
    }

    public void setBananaId(Long bananaId) {
        this.bananaId = bananaId;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public boolean isVeryInteresting() {
        return isVeryInteresting;
    }

    public void setVeryInteresting(boolean veryInteresting) {
        isVeryInteresting = veryInteresting;
    }
}