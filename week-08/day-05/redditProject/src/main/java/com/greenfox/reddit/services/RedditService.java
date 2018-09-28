package com.greenfox.reddit.services;

public interface RedditService {
    void increaseVoteByOne(long id);

    void decreaseVoteByOne(long id);

    void addNewReddit(String name, String url);

}
