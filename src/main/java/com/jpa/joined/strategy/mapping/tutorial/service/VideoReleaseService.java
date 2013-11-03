package com.jpa.joined.strategy.mapping.tutorial.service;

import com.jpa.joined.strategy.mapping.tutorial.domain.VideoRelease;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class VideoReleaseService {

    private EntityManager em;

    public VideoReleaseService(EntityManager em) {
        this.em = em;
    }

    public List<VideoRelease> findAllVideoReleases() {
        TypedQuery<VideoRelease> query = em.createQuery("SELECT v FROM VideoRelease v", VideoRelease.class);
        return query.getResultList();
    }
}
