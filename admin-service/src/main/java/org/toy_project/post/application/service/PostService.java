package org.toy_project.post.application.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.toy_project.post.adapter.out.persistence.Post;
import org.toy_project.post.application.port.in.GetPostUseCase;
import org.toy_project.post.application.port.out.LoadPostPort;

@Service
@RequiredArgsConstructor
class PostService implements GetPostUseCase {

    private final LoadPostPort loadPostPort;


    @Override
    public List<Post> getPosts() {
        return loadPostPort.loadPosts();
    }


    @Override
    public Post getPost(Long id) {
        return loadPostPort.loadPost(id);
    }
}
