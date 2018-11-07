package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    @Test
    public void testCalculateStatisticsWithZeroPosts() {
        //Given
        StatisticsCounter statisticsCounter = new StatisticsCounter();

        //tworzenie mocka statistics
        Statistics statisticsMock = mock(Statistics.class);
        List<String> names = new ArrayList<>();
        names.add("Marek");
        names.add("Michal");
        names.add("Monika");

        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(3, statisticsCounter.getUsersQuantity());
        Assert.assertEquals(0, statisticsCounter.getPosts());
        Assert.assertEquals(0, statisticsCounter.getComments());
        Assert.assertEquals(0, statisticsCounter.getAvgPostPerUser(),0.001);   // co z tym ? dzielenie przez 0
        Assert.assertEquals(0, statisticsCounter.getAvgCommentsPerUser(),0.001);
        Assert.assertEquals(0, statisticsCounter.getAvgCommentsPerPost(), 0.001);
    }

    @Test
    public void testCalculateStatisticsWithManyPosts() {
        //Given
        StatisticsCounter statisticsCounter = new StatisticsCounter();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> names = new ArrayList<>();
        names.add("Marek");
        names.add("Michal");
        names.add("Monika");
        names.add("Marta");

        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(3000);

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(4, statisticsCounter.getUsersQuantity());
        Assert.assertEquals(1000, statisticsCounter.getPosts());
        Assert.assertEquals(3000, statisticsCounter.getComments());
        Assert.assertEquals(250, statisticsCounter.getAvgPostPerUser(), 0.001);
        Assert.assertEquals(750, statisticsCounter.getAvgCommentsPerUser(), 0.001);
        Assert.assertEquals(3, statisticsCounter.getAvgCommentsPerPost(), 0.001);
    }

    @Test
    public  void testCalculateStatisticsLessComments() {
        //Given
        StatisticsCounter statisticsCounter = new StatisticsCounter();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> names = new ArrayList<>();
        names.add("Marek");
        names.add("Michal");
        names.add("Monika");
        names.add("Marta");

        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(4, statisticsCounter.getUsersQuantity());
        Assert.assertEquals(1000, statisticsCounter.getPosts());
        Assert.assertEquals(0, statisticsCounter.getComments());
        Assert.assertEquals(250, statisticsCounter.getAvgPostPerUser(), 0.001);
        Assert.assertEquals(0, statisticsCounter.getAvgCommentsPerUser(), 0.001);
        Assert.assertEquals(0, statisticsCounter.getAvgCommentsPerPost(), 0.001);
    }
    @Test
    public  void testCalculateStatisticsCommentsGreaterThanPosts() {
        //Given
        StatisticsCounter statisticsCounter = new StatisticsCounter();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> names = new ArrayList<>();
        names.add("Marek");
        names.add("Michal");
        names.add("Monika");
        names.add("Marta");

        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(4, statisticsCounter.getUsersQuantity());
        Assert.assertEquals(100, statisticsCounter.getPosts());
        Assert.assertEquals(1000, statisticsCounter.getComments());
        Assert.assertEquals(25, statisticsCounter.getAvgPostPerUser(), 0.001);
        Assert.assertEquals(250, statisticsCounter.getAvgCommentsPerUser(), 0.001);
        Assert.assertEquals(10, statisticsCounter.getAvgCommentsPerPost(), 0.001);
    }
    @Test
    public  void testCalculateStatisticsWithZeroUsers() {
        //Given
        StatisticsCounter statisticsCounter = new StatisticsCounter();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> names = new ArrayList<>();


        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, statisticsCounter.getUsersQuantity());
        Assert.assertEquals(100, statisticsCounter.getPosts());
        Assert.assertEquals(1000, statisticsCounter.getComments());
        Assert.assertEquals(0, statisticsCounter.getAvgPostPerUser(), 0.001);
        Assert.assertEquals(0, statisticsCounter.getAvgCommentsPerUser(), 0.001);
        Assert.assertEquals(10, statisticsCounter.getAvgCommentsPerPost(), 0.001);
    }
    @Test
    public  void testCalculateStatisticsWithManyUsers() {
        //Given
        StatisticsCounter statisticsCounter = new StatisticsCounter();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> names = new ArrayList<>();
        names.add("Marek");
        names.add("Michal");
        names.add("Monika");
        names.add("Marta");
        names.add("Michal");
        names.add("Monika");
        names.add("Marta");
        names.add("Michal");
        names.add("Monika");
        names.add("Marta");

        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(10, statisticsCounter.getUsersQuantity());
        Assert.assertEquals(100, statisticsCounter.getPosts());
        Assert.assertEquals(1000, statisticsCounter.getComments());
        Assert.assertEquals(10, statisticsCounter.getAvgPostPerUser(), 0.001);
        Assert.assertEquals(100, statisticsCounter.getAvgCommentsPerUser(), 0.001);
        Assert.assertEquals(10, statisticsCounter.getAvgCommentsPerPost(), 0.001);
    }
}
