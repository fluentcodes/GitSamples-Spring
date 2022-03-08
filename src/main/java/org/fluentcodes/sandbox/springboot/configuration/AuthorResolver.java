package org.fluentcodes.sandbox.springboot.configuration;

import com.coxautodev.graphql.tools.GraphQLResolver;
import java.util.List;

public class AuthorResolver implements GraphQLResolver<Author> {
  private PostDao postDao;

  public AuthorResolver(PostDao postDao) {
    this.postDao = postDao;
  }

  public List<Post> getPosts(Author author) {
    return postDao.getAuthorPosts(author.getId());
  }
}