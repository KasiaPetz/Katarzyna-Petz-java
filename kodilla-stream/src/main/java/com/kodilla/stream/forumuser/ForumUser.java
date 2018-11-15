package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;

public class ForumUser {
    private int id;
    private String userName;
    private char sex;
    private LocalDate dateOfbirth;
    private int postsQuantity;

    public ForumUser(int id, String userName, char sex, LocalDate dateOfbirth, int postsQuantity) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.dateOfbirth = dateOfbirth;
        this.postsQuantity = postsQuantity;
    }

    public int getId() {
        return id;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfbirth() {
        return dateOfbirth;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getAgeInYears() {
        //tworzy obiekt LocalDate z aktualna data
        LocalDate now = LocalDate.now();
        return Period.between(dateOfbirth, now).getYears();
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfbirth=" + dateOfbirth +
                ", postsQuantity=" + postsQuantity +
                '}';
    }
}
