package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is beginning of tests. ");
    }
    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests re finished");
    }
    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    // test 1
    @Test
    public void testAddPost() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        //When
        forumUser.addPost("mrsmith", "Helloeveryone, this is my first contribution here");
        //Then
        Assert.assertEquals(1, forumUser.getPostsQuantity());
    }

}
