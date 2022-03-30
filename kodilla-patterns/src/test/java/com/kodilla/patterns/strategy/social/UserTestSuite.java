package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.SnapchatPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User zbyszek = new Millenials("Zbyszek Kłoda");
        User ryszard= new YGeneration("Ryszard Pudełko");
        User franek = new ZGeneration("Franek Siekiera");

        //When
        String zbyszekPost = zbyszek.sharePost();
        System.out.println("Zbyszek posted on: " + zbyszekPost);
        String ryszardPost = ryszard.sharePost();
        System.out.println("Ryszard posted on: " + ryszardPost);
        String franekPost = franek.sharePost();
        System.out.println("Franek posted on: " + franekPost);

        //Then
        assertEquals("Facebook", zbyszekPost);
        assertEquals("Twitter", ryszardPost);
        assertEquals("Snapchat", franekPost);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User zbyszek = new Millenials("Zbyszek Kłoda");

        //When
        String zbyszekPost = zbyszek.sharePost();
        System.out.println("Zbyszek posted on: " + zbyszekPost);
        zbyszek.setSocialPublisher(new SnapchatPublisher());
        zbyszekPost = zbyszek.sharePost();
        System.out.println("Zbyszek posted on: " + zbyszekPost);

        //Then
        assertEquals("Snapchat", zbyszekPost);
    }
}
