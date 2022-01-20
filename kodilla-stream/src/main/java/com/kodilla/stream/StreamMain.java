package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultMap = forum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getBirthDate().getYear() < 2002)
                .filter(user -> user.getPublishedPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

        System.out.println("# elements: " + theResultMap.size());
        theResultMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
