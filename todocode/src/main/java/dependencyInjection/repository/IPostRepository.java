package dependencyInjection.repository;

import dependencyInjection.model.Post;

import java.util.List;

public interface IPostRepository {

    public List<Post> getPosts();
}
