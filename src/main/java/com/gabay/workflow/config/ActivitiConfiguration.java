package com.gabay.workflow.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Configuration
public class ActivitiConfiguration {

    private Logger logger = LoggerFactory.getLogger(ActivitiConfiguration.class);

    @Bean
    public UserDetailsService userDetailsService() {

        InMemoryUserDetailsManager inMemoryUserDetailsManager = new InMemoryUserDetailsManager();

        /**
         * 配置默认账号：账号-密码-权限
         * 角色ROLE_ACTIVITI_USER可以调用Activiti官方API
         */
        String[][] userGroupAndRoles = {
                {"admin", "password", "ROLE_ACTIVITI_ADMIN", "ROLE_ACTIVITI_USER", "GROUP_activitiTeam"},
                {"staff", "password", "ROLE_ACTIVITI_USER", "GROUP_activitiTeam"},
                {"leader", "password", "ROLE_ACTIVITI_USER", "GROUP_activitiTeam"},
                {"manager", "password", "ROLE_ACTIVITI_USER", "GROUP_activitiTeam"},
                {"other", "password", "ROLE_ACTIVITI_USER", "GROUP_otherTeam"},
        };

        for (String[] user : userGroupAndRoles) {
            List<String> authorities = Arrays.asList(Arrays.copyOfRange(user, 2, user.length));
            logger.info("> Registering new user: " + user[0] + " with the following Authorities[" + authorities + "]");
            inMemoryUserDetailsManager.createUser(new User(user[0], passwordEncoder().encode(user[1]),
                    authorities.stream().map(s -> new SimpleGrantedAuthority(s)).collect(Collectors.toList())));
        }

        return inMemoryUserDetailsManager;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
