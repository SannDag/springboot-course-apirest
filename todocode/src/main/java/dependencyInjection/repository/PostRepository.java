package dependencyInjection.repository;

import org.springframework.stereotype.Repository;
import dependencyInjection.model.Post;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostRepository implements IPostRepository{
    @Override
    public List<Post> getPosts() {
        List<Post> postList = new ArrayList<Post>();
        postList.add(new Post(1L, "How to do a desktop app", "SD"));
        postList.add(new Post(1L, "How to do a landing page?", "SD"));

        return postList;
    }
}
