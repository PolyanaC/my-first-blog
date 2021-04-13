package com.spacoeducar.codeblog.service;

import java.util.List;

import com.spacoeducar.codeblog.model.Post;

public interface CodeblogService {
	List<Post> findAll();
	Post findById(Long id);
	Post save(Post post);

}
