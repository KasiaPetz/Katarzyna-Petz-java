package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

        forum.getUsersList().add(new ForumUser(1, "user01", 'M',
                LocalDate.of(2010, 5, 12), 20));
        forum.getUsersList().add(new ForumUser(2, "user02", 'M',
                LocalDate.of(1985, 5, 12), 15));
        forum.getUsersList().add(new ForumUser(3, "user03", 'F',
                LocalDate.of(1990, 5, 12), 12));
        forum.getUsersList().add(new ForumUser(4, "user04", 'F',
                LocalDate.of(2005, 5, 12), 25));
        forum.getUsersList().add(new ForumUser(5, "user05", 'M',
                LocalDate.of(1996, 5, 12), 13));
        forum.getUsersList().add(new ForumUser(6, "user06", 'M',
                LocalDate.of(1997, 5, 12), 11));
        forum.getUsersList().add(new ForumUser(7, "user07", 'F',
                LocalDate.of(1994, 5, 12), 33));
        forum.getUsersList().add(new ForumUser(8, "user08", 'M',
                LocalDate.of(1992, 5, 12), 30));
        forum.getUsersList().add(new ForumUser(9, "user09", 'F',
                LocalDate.of(1987, 5, 12), 29));
        forum.getUsersList().add(new ForumUser(10, "user10", 'M',
                LocalDate.of(1980, 5, 12), 5));

        Map<Integer, ForumUser> map = forum.getUsersList().stream()
                .filter( u -> u.getSex() == 'M')
                .filter( u -> u.getAgeInYears() > 20)
                .filter( u -> u.getPostsQuantity() > 0)
                .collect(Collectors.toMap(ForumUser::getId , user -> user));

        map.entrySet().stream()
                .forEach( es -> System.out.println(es.getKey() + " " + es.getValue()));

    }

}
