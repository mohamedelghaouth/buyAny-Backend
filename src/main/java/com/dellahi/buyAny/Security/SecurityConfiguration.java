package com.dellahi.buyAny.Security;

import com.dellahi.buyAny.Services.Impl.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // Set your configuration on the auth object
        //http.cors();
        http
                .csrf().disable()
                .authorizeRequests()
                    .antMatchers("/buyAny/v*/**")
                    .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();
            /*.and()
            .logout()
                .logoutUrl("/buyAny/v1/logout")
                .logoutSuccessUrl("/");*/
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(daoAuthenticationProvider());
        //auth.inMemoryAuthentication().withUser("username").password(encoder.encode("password")).roles("ADMIN");
    }

    @Bean
    public DaoAuthenticationProvider daoAuthenticationProvider(){
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        provider.setPasswordEncoder(encoder);
        provider.setUserDetailsService(userDetailsService);
        return provider;
    }

    /*@Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/css/**","/webjars/**","/js/**");
    }*/
}