package com.example.banana;

import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.MappedProperty;

@MappedEntity(value = "bananas")
public class Banana {

    @Id
    private Long bananaId;

    @MappedProperty(value = "is_active")
    private boolean isActive;

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
}