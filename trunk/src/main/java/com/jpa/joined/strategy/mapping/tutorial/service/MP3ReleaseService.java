package com.jpa.joined.strategy.mapping.tutorial.service;

import com.jpa.joined.strategy.mapping.tutorial.domain.MP3Release;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class MP3ReleaseService {

    private EntityManager em;

    public MP3ReleaseService(EntityManager em) {
        this.em = em;
    }

    public List<MP3Release> findAllMP3Releases() {
        TypedQuery<MP3Release> query = em.createQuery("SELECT m FROM MP3Release m", MP3Release.class);
        return query.getResultList();
    }
}
