package com.jpa.joined.strategy.mapping.tutorial;

import com.jpa.joined.strategy.mapping.tutorial.domain.CDRelease;
import com.jpa.joined.strategy.mapping.tutorial.domain.MP3Release;
import com.jpa.joined.strategy.mapping.tutorial.domain.VideoRelease;
import com.jpa.joined.strategy.mapping.tutorial.service.CDReleaseService;
import com.jpa.joined.strategy.mapping.tutorial.service.MP3ReleaseService;
import com.jpa.joined.strategy.mapping.tutorial.service.VideoReleaseService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class JpaJoinedStrategyMappingTutorial {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaJoinedStrategyMappingTutorial");
        EntityManager em = emf.createEntityManager();
        VideoReleaseService videoReleaseService = new VideoReleaseService(em);
        CDReleaseService cdReleaseService = new CDReleaseService(em);
        MP3ReleaseService mp3ReleaseService = new MP3ReleaseService(em);

        System.out.println("--- Finding video releases ---");
        List<VideoRelease> videoReleases = videoReleaseService.findAllVideoReleases();
        for (VideoRelease videoRelease : videoReleases) {
            System.out.println(String.format("Found video release: %s", videoRelease));
        }

        System.out.println("\n--- Finding CD releases ---");
        List<CDRelease> cdReleases = cdReleaseService.findAllCDReleases();
        for (CDRelease cdRelease : cdReleases) {
            System.out.println(String.format("Found CD release: %s", cdRelease));
        }

        System.out.println("\n--- Finding MP3 releases ---");
        List<MP3Release> mp3Releases = mp3ReleaseService.findAllMP3Releases();
        for (MP3Release mp3Release : mp3Releases) {
            System.out.println(String.format("Found MP3 release: %s", mp3Release));
        }
    }
}
