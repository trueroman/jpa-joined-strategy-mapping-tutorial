package com.jpa.joined.strategy.mapping.tutorial.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "video_releases")
@DiscriminatorValue("Video")
public class VideoRelease extends Release {

    @Column(name = "video_release_type")
    @Enumerated(EnumType.STRING)
    private VideoReleaseType type;

    public VideoRelease() {

    }

    public VideoRelease(int id, String name, int year, String length, VideoReleaseType type) {
        super(id, name, year, length);
        this.type = type;
    }

    public VideoReleaseType getType() {
        return type;
    }

    public void setType(VideoReleaseType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "VideoRelease{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", year=" + getYear() +
                ", length='" + getLength() + '\'' +
                ", type=" + type +
                '}';
    }
}
