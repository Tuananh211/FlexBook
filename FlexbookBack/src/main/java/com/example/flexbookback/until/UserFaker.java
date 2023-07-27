//package com.example.flexbookback.until;
//
//import com.example.flexbookback.model.User;
//import com.example.flexbookback.repository.UserRepository;
//import com.github.javafaker.Faker;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jdbc.core.JdbcAggregateTemplate;
//
//import java.sql.Timestamp;
//import java.time.Instant;
//
//import static java.lang.System.*;
//
//@Configuration
//public class UserFaker  implements CommandLineRunner {
//    private final UserRepository userRepository;
//    private final Faker faker;
//
//    public UserFaker(UserRepository userRepository) {
//        this.userRepository = userRepository;
//        this.faker = new Faker();
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        int numberOfFakeUsers = 10; // Thay đổi số lượng user giả bạn muốn tạo
//
//        for (int i = 0; i < numberOfFakeUsers; i++) {
//            User fakeUser = new User();
//            fakeUser.setUsername(faker.name().username());
//            fakeUser.setEmail(faker.internet().emailAddress());
//            fakeUser.setPassword(faker.internet().password());
//            fakeUser.setProfile_picture(faker.internet().avatar());
//            fakeUser.setBio(faker.lorem().sentence());
//
//            Instant currentTimestamp = Instant.now();
//            long createdAtMillis = faker.date().past(10 * 365).getTime();
//            long updatedAtMillis = faker.date().past(365).getTime();
//
//            fakeUser.setCreated_at(Timestamp.from(Instant.ofEpochMilli(createdAtMillis)));
//            fakeUser.setUpdated_at(Timestamp.from(Instant.ofEpochMilli(updatedAtMillis)));
//            userRepository.save(fakeUser);
//        }
//    }
//}
