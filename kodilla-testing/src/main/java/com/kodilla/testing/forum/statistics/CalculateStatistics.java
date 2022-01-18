package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {

    private Statistics statisticsMock;
    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double averagePostQuantityPerUser;
    private double averageCommentsQuantityPerUser;
    private double averageCommentsQuantityPerPost;

    public CalculateStatistics(Statistics statisticsMock) {
        this.statisticsMock = statisticsMock;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersQuantity = statistics.usersNames().size();

        postsQuantity = statistics.postsCount();

        commentsQuantity = statistics.commentsCount();
        if (statistics.usersNames().size() > statistics.postsCount() && statistics.usersNames().size() > 0) {
            averagePostQuantityPerUser = statistics.postsCount() / statistics.usersNames().size();
        }
        if (statistics.usersNames().size() > statistics.commentsCount() && statistics.usersNames().size() > 0) {
            averageCommentsQuantityPerUser = statistics.commentsCount() / statistics.usersNames().size();
        }
        if (statistics.postsCount() > statistics.commentsCount() && statistics.commentsCount() > 0) {
            averageCommentsQuantityPerPost = statistics.postsCount() / statistics.commentsCount();
        }
    }

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getAveragePostQuantityPerUser() {
        return averagePostQuantityPerUser;
    }

    public double getAverageCommentsQuantityPerUser() {
        return averageCommentsQuantityPerUser;
    }

    public double getAverageCommentsQuantityPerPost() {
        return averageCommentsQuantityPerPost;
    }
}
