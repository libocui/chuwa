package com.chuwa.xhs.service;

import com.chuwa.xhs.payload.PostDto;
import com.chuwa.xhs.payload.PostResponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);
    List<PostDto> getAllPost();

    PostResponse getAllPost(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto,long id);

    void deletePostById(long id);
}
