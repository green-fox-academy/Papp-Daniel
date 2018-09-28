package com.greenfox.reddit;

import com.greenfox.reddit.models.Reddit;
import com.greenfox.reddit.repositories.RedditRepository;
import com.greenfox.reddit.services.RedditService;
import com.greenfox.reddit.services.RedditServiseImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedditApplication.class, args);
    }

}
