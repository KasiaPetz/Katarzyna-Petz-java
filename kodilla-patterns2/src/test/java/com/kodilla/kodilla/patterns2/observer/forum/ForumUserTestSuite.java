package com.kodilla.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.*;

public class ForumUserTestSuite {
    @Test
    //Given
    ForumTopic javaHelpForum = new JavaHelpForumTopic();
    ForumTopic javaToolForum = new JavaToolsForumTopic();
    ForumUser johnSmith = new ForumUser("John Smith");
    ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
    ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
    javaHelpForum.registerObserver(johnSmith);
    javaToolForum.registerObserver(ivoneEscobar);
    javaHelpForum.registerObserver(jessiePinkman);
    javaToolForum.registerObserver(jessiePinkman);
    //When
    javaHelpForum.addPost("Hi everyone! Could you help me with for loop?");
    javaHelpForum.addPost("Better try to use while loop in this case.");
}