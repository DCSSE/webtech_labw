package kz.iitu.csse241.burkutbayeva.config;

import kz.iitu.csse241.burkutbayeva.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

@Configuration
@Profile("${spring.profiles.active}")
public class UserConfig {

    @Autowired
    private UserService userService;

    @Bean
    @Scope("singleton")
    @Lazy
    @DependsOn("lifecycleBean")
    public UserInitializer userInitializer() {
        return new UserInitializer(userService);
    }

    public static class UserInitializer {
        private final UserService userService;

        public UserInitializer(UserService userService) {
            this.userService = userService;
            System.out.println("Lazy-loaded UserInitializer bean");
            userService.getAllUsers().forEach(u -> System.out.println(u.getUserName()));
        }
    }
}

