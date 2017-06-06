package edu.iis.mto.blog.domain.repository;

import edu.iis.mto.blog.domain.model.AccountStatus;
import edu.iis.mto.blog.domain.model.BlogPost;
import edu.iis.mto.blog.domain.model.LikePost;
import edu.iis.mto.blog.domain.model.User;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 2017-06-06.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class LikeRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private LikeRepositoryTest likeRepository;

    @Autowired
    private BlogPostRepository blogPostRepository;

    @Autowired
    private UserRepository userRepository;

    private User user;
    private BlogPost blogPost;
    private LikePost likePost;

    @Before
 	public void setUp() {
        user = new User();
        user.setFirstName("Adam");
        user.setLastName("Rezner");
        user.setEmail("adam@mail.com");
        user.setAccountStatus(AccountStatus.NEW);


        blogPost = new BlogPost();
        List<LikePost> likes = new ArrayList<>();
        likes.add(likePost);
        blogPost.setUser(user);
        blogPost.setEntry("Post");
        blogPost.setLikes(likes);

        likePost = new LikePost();
        likePost.setUser(user);
        likePost.setPost(blogPost);
    }
}
