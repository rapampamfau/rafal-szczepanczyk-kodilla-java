package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int userId;
    private final String username;
    private final char sex;
    private final LocalDate birthDate;
    private final int publishedPosts;

    public ForumUser(final int userId, final String username, final char sex,
                     final int yearOfBirth, final int monthOfBirth, final int dayOfBirth,
                     final int publishedPosts) {
        this.userId = userId;
        this.username = username;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.publishedPosts = publishedPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPublishedPosts() {
        return publishedPosts;
    }

    public String toString() {
        return username + " " + sex + " " + birthDate;
    }
}
