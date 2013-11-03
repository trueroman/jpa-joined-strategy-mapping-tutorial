package com.jpa.joined.strategy.mapping.tutorial.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "mp3_releases")
@DiscriminatorValue("MP3")
@AttributeOverride(name = "numberOfTracks", column = @Column(name = "mp3_release_number_of_tracks"))
public class MP3Release extends AudioRelease {

    @Column(name = "mp3_release_bitrate")
    private int bitrate;

    public MP3Release() {

    }

    public MP3Release(int id, String name, int year, String length, int numberOfTracks, int bitrate) {
        super(id, name, year, length, numberOfTracks);
        this.bitrate = bitrate;
    }

    public int getBitrate() {
        return bitrate;
    }

    public void setBitrate(int bitrate) {
        this.bitrate = bitrate;
    }

    @Override
    public String toString() {
        return "MP3Release{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", year=" + getYear() +
                ", length='" + getLength() + '\'' +
                ", numberOfTracks=" + getNumberOfTracks() +
                ", bitrate=" + bitrate +
                '}';
    }
}
