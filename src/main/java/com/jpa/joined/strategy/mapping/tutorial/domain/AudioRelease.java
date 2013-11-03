package com.jpa.joined.strategy.mapping.tutorial.domain;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AudioRelease extends Release {

    private int numberOfTracks;

    protected AudioRelease() {

    }

    protected AudioRelease(int id, String name, int year, String length, int numberOfTracks) {
        super(id, name, year, length);
        this.numberOfTracks = numberOfTracks;
    }

    public int getNumberOfTracks() {
        return numberOfTracks;
    }

    public void setNumberOfTracks(int numberOfTracks) {
        this.numberOfTracks = numberOfTracks;
    }
}
