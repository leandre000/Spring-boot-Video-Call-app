package com.leandre.videocall;

import com.leandre.videocall.user.User;
import com.leandre.videocall.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallApplication {

    public static void main(String[] args) {
        SpringApplication.run(VideocallApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(
            UserService service
    ) {
        return args -> {
            service.register(User.builder()
                    .username("Shema")
                    .email("shema@gmail.com")
                    .password("aaa")
                    .build());

            service.register(User.builder()
                    .username("Honore")
                    .email("honore@gmail.com")
                    .password("aaa")
                    .build());

            service.register(User.builder()
                    .username("prince")
                    .email("prince@gmail.com")
                    .password("aaa")
                    .build());
        };
    }

}
