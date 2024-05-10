package org.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {

    @Bean
    UserDetailsService userDetails() {
        UserDetails userDetails = User.withDefaultPasswordEncoder()
                .roles("user")
                .username("admin")
                .password("admin")
                .build();
        return new InMemoryUserDetailsManager(userDetails);
    }
}
