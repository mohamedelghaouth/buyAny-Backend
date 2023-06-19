package com.dellahi.buyAny.Security;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@RequiredArgsConstructor
@Configuration
@EnableWebSecurity
public class OAuth2LoginConfig {
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//            .authorizeHttpRequests(authorize -> authorize
//                    .anyRequest().authenticated()
//            )
//            .oauth2Login(oauth2 -> oauth2
//                .authorizationEndpoint(authorization -> authorization
//                    .baseUri("http://localhost:8080/auth/realms/BuyAny/protocol/openid-connect/auth")
//                )
//            );
//        return http.build();
//    }
}
