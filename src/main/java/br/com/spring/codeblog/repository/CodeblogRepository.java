package br.com.spring.codeblog.repository;

import br.com.spring.codeblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeblogRepository extends JpaRepository<Post, Long> {
}
