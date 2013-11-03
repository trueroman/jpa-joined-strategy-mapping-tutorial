package com.jpa.joined.strategy.mapping.tutorial.service;

import com.jpa.joined.strategy.mapping.tutorial.domain.CDRelease;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class CDReleaseService {

    private EntityManager em;

    public CDReleaseService(EntityManager em) {
        this.em = em;
    }

    public List<CDRelease> findAllCDReleases() {
        TypedQuery<CDRelease> query = em.createQuery("SELECT c FROM CDRelease c", CDRelease.class);
        return query.getResultList();
    }
}
