package com.barban.corentin.m2.miagesousleau.proxy.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;



@Configuration
@EnableResourceServer
public class GatewayConfiguration extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(final HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.cors().and().authorizeRequests()
                .antMatchers("/oauth/**")
                .permitAll()
                .antMatchers("/**/swagger-ui-custom/html/**")
                .permitAll()
                .antMatchers("/**/api-docs")
                .permitAll()
                .antMatchers("/**")
                .authenticated();
    }

}
