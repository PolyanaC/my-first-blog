package com.spacoeducar.codeblog.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spacoeducar.codeblog.model.Post;
import com.spacoeducar.codeblog.repository.CodeBlogRepository;
import com.spacoeducar.codeblog.service.CodeblogService;

@Service
public class CodeblogSermviceImpl implements CodeblogService {
	
	@Autowired
	CodeBlogRepository codeBlogRepository;

	@Override
	public List<Post> findAll() {
		return codeBlogRepository.findAll();
	}

	@Override
	public Post findById(Long id) {
		return codeBlogRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return codeBlogRepository.save(post);
	}

}
