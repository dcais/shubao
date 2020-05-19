package org.dcais.shubao.shubao.conf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;

@Configuration
public class ConfWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {
    @Autowired
    private ShubaoUserDetailService shubaoUserDetailService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(shubaoUserDetailService);
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .formLogin().and()
                .csrf().disable();
    }
}
