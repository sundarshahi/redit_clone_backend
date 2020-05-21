package com.sundar.reditclone.repository;

import com.sundar.reditclone.model.Comment;
import com.sundar.reditclone.model.Post;
import com.sundar.reditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
