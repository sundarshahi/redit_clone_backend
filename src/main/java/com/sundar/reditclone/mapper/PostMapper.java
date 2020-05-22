package com.sundar.reditclone.mapper;

import com.sundar.reditclone.dto.PostRequest;
import com.sundar.reditclone.dto.PostResponse;
import com.sundar.reditclone.model.Post;
import com.sundar.reditclone.model.Subreddit;
import com.sundar.reditclone.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PostMapper {

//    @Autowired
//    private CommentRepository commentRepository;
//    @Autowired
//    private VoteRepository voteRepository;
//    @Autowired
//    private AuthService authService;


    @Mapping(target = "createdDate", expression = "java(java.time.Instant.now())")
    @Mapping(target = "description", source = "postRequest.description")
    @Mapping(target = "subreddit", source = "subreddit")
    @Mapping(target = "user", source = "user")
//    @Mapping(target = "voteCount", constant = "0")
    Post map(PostRequest postRequest, Subreddit subreddit, User user);

    @Mapping(target = "id", source = "postId")
    @Mapping(target = "subredditName", source = "subreddit.name")
    @Mapping(target = "userName", source = "user.username")
//    @Mapping(target = "commentCount", expression = "java(commentCount(post))")
//    @Mapping(target = "duration", expression = "java(getDuration(post))")
    PostResponse mapToDto(Post post);

//    Integer commentCount(Post post) {
//        return commentRepository.findByPost(post).size();
//    }

//    String getDuration(Post post) {
//        return TimeAgo.using(post.getCreatedDate().toEpochMilli());
//    }
}