package com.kodilla.testing.forum.statistics;


public class StatisticsCounter{

    private int usersQuantity;
    private int posts;
    private int comments;
    private double avgPostPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

 /*   public StatisticsCounter(int usersQuantity, int posts, int comments, double avgPostPerUser, double avgCommentsPerUser, double avgCommentsPerPost) {
        this.usersQuantity = usersQuantity;
        this.posts = posts;
        this.comments = comments;
        this.avgPostPerUser = avgPostPerUser;
        this.avgCommentsPerUser = avgCommentsPerUser;
        this.avgCommentsPerPost = avgCommentsPerPost;
    } */

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPosts() {
        return posts;
    }

    public int getComments() {
        return comments;
    }

    public double getAvgPostPerUser() {
        return avgPostPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersQuantity = statistics.usersNames().size();
        posts = statistics.postsCount();
        comments = statistics.commentsCount();
        if(usersQuantity !=0) {
            avgPostPerUser = posts / usersQuantity;
            avgCommentsPerUser = comments / usersQuantity;
        } else {
            avgPostPerUser = 0;
            avgCommentsPerUser = 0;
        }
        if(posts != 0) {
            avgCommentsPerPost = comments / posts;
        } else {
            avgCommentsPerPost = 0;
        }
    }

    public void showStatistics(){
        System.out.println("Users : " + usersQuantity);
        System.out.println("Posts : " + posts);
        System.out.println("Comments :" + comments);
        System.out.println("Avg posts per user: " + avgPostPerUser);
        System.out.println("Avg Comments per user : " + avgCommentsPerUser);
        System.out.println("Avg comments per post : " + avgCommentsPerPost);
    }
}
