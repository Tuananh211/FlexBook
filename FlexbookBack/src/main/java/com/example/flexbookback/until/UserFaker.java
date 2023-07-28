//package com.example.flexbookback.until;
//
//import com.example.flexbookback.model.Posts;
//import com.example.flexbookback.model.User;
//import com.example.flexbookback.repository.PostRepository;
//import com.example.flexbookback.repository.UserRepository;
//import com.github.javafaker.Faker;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Configuration;
//
//import java.sql.Timestamp;
//import java.time.LocalDate;
//
//@Configuration
//public class UserFaker  implements CommandLineRunner {
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private PostRepository postRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//        Faker faker = new Faker();
//
//        LocalDate endDate = LocalDate.now();
//        LocalDate startDate = endDate.minusYears(5);
//        java.util.Date date = faker.date().between(
//                java.sql.Date.valueOf(startDate),
//                java.sql.Date.valueOf(endDate)
//        );
//        Timestamp createdAt = new Timestamp(date.getTime());
//
//        for (int i = 0; i < 10; i++) {
//            User user = new User();
//            user.setUsername(faker.name().username());
//            user.setEmail(faker.internet().emailAddress());
//            user.setPassword(faker.internet().password());
//            user.setBio(faker.lorem().sentence());
//            user.setCreated_at(createdAt);
//            user.setUpdated_at(createdAt);
//            userRepository.save(user);
//        }
//
//        for (int i = 0; i < 10; i++) {
//            Posts post = new Posts();
//            post.setContent(faker.lorem().paragraph());
//            post.setPost_image("https://images.unsplash.com/photo-1688389244936-97e9874ec347?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwxfDB8MXxyYW5kb218MHx8fHx8fHx8MTY5MDQ1Njc3OQ&ixlib=rb-4.0.3&q=80&w=1080");
//            post.setCreated_at(createdAt);
//            post.setUpdated_at(createdAt);
//
//            User user = userRepository.findRandomUser();
//            post.setUser(user);
//
//            postRepository.save(post);
//        }
//    }
//}
