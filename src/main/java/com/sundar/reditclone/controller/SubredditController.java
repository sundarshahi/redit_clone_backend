package com.sundar.reditclone.controller;


import com.sundar.reditclone.dto.SubredditDto;
import com.sundar.reditclone.service.SubredditServices;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/subreddit")
@AllArgsConstructor
@Slf4j
public class SubredditController {

    private final SubredditServices subredditServices;

    @GetMapping
    public List<SubredditDto> getAllSubreddits() {
        return subredditServices.getAll();
    }

    @GetMapping("/{id}")
    public SubredditDto getSubreddit(@PathVariable Long id) {
        return subredditServices.getSubreddit(id);
    }

    @PostMapping
    public SubredditDto create(@RequestBody @Valid SubredditDto subredditDto) {
        return subredditServices.save(subredditDto);
    }
}
