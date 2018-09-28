package com.greenfox.reddit.repositories;

import com.greenfox.reddit.models.Reddit;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RedditRepository extends CrudRepository<Reddit,Long> {
    Reddit findById(long id);
    Iterable<Reddit> findAllByOrderByVoteDesc();


}
