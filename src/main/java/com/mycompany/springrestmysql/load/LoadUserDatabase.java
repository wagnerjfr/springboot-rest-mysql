package com.mycompany.springrestmysql.load;

import com.mycompany.springrestmysql.model.User;
import com.mycompany.springrestmysql.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadUserDatabase {

    @Bean
    CommandLineRunner loadDatabase (UserService userService) {
        return args -> {
            log.info("Preloading " + userService.saveUser(new User("Wagner Jose Franchin", "wagner@teste.com")));
        };
    }
}
