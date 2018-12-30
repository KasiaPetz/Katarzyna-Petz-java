package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.Millenials;
import com.kodilla.patterns.strategy.social.SnapchatPublisher;
import com.kodilla.patterns.strategy.social.YGeneration;
import com.kodilla.patterns.strategy.social.ZGeneration;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefalutSharingStrategies() {
        //Given
        Millenials ewa = new Millenials("Ewa");
        YGeneration marek = new YGeneration("Marek");
        ZGeneration paulina = new ZGeneration("Paulina");

        //When
        String ewaPosting = ewa.sharePost();
        System.out.println("Ewa " + ewaPosting);
        String marekPosting = marek.sharePost();
        System.out.println("Marek " + marekPosting);
        String paulinaPosting = paulina.sharePost();
        System.out.println("Paulina " + paulinaPosting);

        //Then
        Assert.assertEquals("published new post on Facebook", ewaPosting );
        Assert.assertEquals("published new tweet on Twitter", marekPosting);
        Assert.assertEquals("published new snap on Snapchat", paulinaPosting);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        Millenials ewa = new Millenials("Ewa");

        //When
        String ewaPosting = ewa.sharePost();
        System.out.println("Ewa " + ewaPosting);
        ewa.setPublishPreferences(new SnapchatPublisher());
        ewaPosting = ewa.sharePost();
        System.out.println("Ewa tried something new and " + ewaPosting);

        //Then
        Assert.assertEquals("published new snap on Snapchat", ewaPosting);
    }
}
