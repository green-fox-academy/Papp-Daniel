package com.greenfox.reddit.services;

import com.greenfox.reddit.models.Reddit;
import com.greenfox.reddit.repositories.RedditRepository;
import org.springframework.stereotype.Service;

import java.time.Clock;
import java.time.LocalDateTime;

@Service
public class RedditServiseImpl implements RedditService {

    private final RedditRepository redditRepository;

    public RedditServiseImpl(RedditRepository redditRepository) {
        this.redditRepository = redditRepository;
    }

    @Override
    public void increaseVoteByOne(long id) {
        Reddit redit = redditRepository.findById(id);
        redit.setVote(redit.getVote() + 1);
        redditRepository.save(redit);
    }

    @Override
    public void decreaseVoteByOne(long id) {
        Reddit redit = redditRepository.findById(id);
        redit.setVote(redit.getVote() - 1);
        redditRepository.save(redit);
    }

    @Override
    public void addNewReddit(String name, String url) {
        Reddit reddit = new Reddit(name, url);
        reddit.setCreatedAt(LocalDateTime.now(Clock.systemUTC()));
        redditRepository.save(reddit);
    }

    public Iterable<Reddit> findAllByOrderByVoteDesc() {
        return redditRepository.findAllByOrderByVoteDesc();
    }
}
