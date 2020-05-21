package com.sundar.reditclone.repository;

import com.sundar.reditclone.model.Post;
import com.sundar.reditclone.model.User;
import com.sundar.reditclone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}