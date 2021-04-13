package com.spacoeducar.codeblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spacoeducar.codeblog.model.Post;

public interface CodeBlogRepository extends JpaRepository<Post, Long> {

}
