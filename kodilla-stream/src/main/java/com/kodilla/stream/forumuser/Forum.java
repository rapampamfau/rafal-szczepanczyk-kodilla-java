package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "user1", 'M',
                1990, 12, 3, 1));
        userList.add(new ForumUser(2, "user2", 'M',
                1995, 2, 1, 6));
        userList.add(new ForumUser(3, "user3", 'F',
                2001, 6, 22, 0));
        userList.add(new ForumUser(4, "user4", 'F',
                1997, 8, 5, 0));
        userList.add(new ForumUser(5, "user5", 'F',
                1992, 9, 2, 3));
        userList.add(new ForumUser(6, "user6", 'M',
                2003, 10, 18, 5));
        userList.add(new ForumUser(7, "user7", 'F',
                1999, 3, 30, 20));
        userList.add(new ForumUser(8, "user8", 'M',
                1985, 2, 15, 100));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
