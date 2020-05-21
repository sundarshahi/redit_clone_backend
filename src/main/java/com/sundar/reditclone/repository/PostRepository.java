package com.sundar.reditclone.repository;

import com.sundar.reditclone.model.Post;
import com.sundar.reditclone.model.Subreddit;
import com.sundar.reditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}