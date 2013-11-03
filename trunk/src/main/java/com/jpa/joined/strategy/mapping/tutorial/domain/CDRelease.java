package com.jpa.joined.strategy.mapping.tutorial.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "cd_releases")
@DiscriminatorValue("CD")
@AttributeOverride(name = "numberOfTracks", column = @Column(name = "cd_release_number_of_tracks"))
public class CDRelease extends AudioRelease {

    @Column(name = "cd_release_type")
    @Enumerated(EnumType.STRING)
    private CDReleaseType type;

    public CDRelease() {

    }

    public CDRelease(int id, String name, int year, String length, int numberOfTracks, CDReleaseType type) {
        super();
        this.type = type;
    }

    public CDReleaseType getType() {
        return type;
    }

    public void setType(CDReleaseType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CDRelease{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", year=" + getYear() +
                ", length='" + getLength() + '\'' +
                ", numberOfTracks=" + getNumberOfTracks() +
                ", type=" + type +
                '}';
    }
}
