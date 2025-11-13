package com.example.demo.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    // 스프링시큐리티 암호화객체
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

    // 기본 시큐리티를 설정하는 메서드
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        // csrf 토큰 사용 안함
        http.csrf(csrf -> csrf.disable());

        // 권한설정
        // 모든 요청에 대해서 사용자 인증이 필요함
        //http.authorizeHttpRequests( authorize -> authorize.anyRequest().authenticated());

        // user 페이지에 대해서만 인증이 필요함
        //http.authorizeHttpRequests(authorize -> authorize.requestMatchers("/user/**").authenticated().anyRequest().permitAll());

        // 인증 이후에 USER라는 권한을 가지고 있는가?
//        http.authorizeHttpRequests(authorize -> authorize
//                .requestMatchers("/user/**").hasRole("USER")
//                .anyRequest().permitAll());

        // user페이지는 USER 권한, admin 페이지는 ADMIN 권한
//        http.authorizeHttpRequests(authorize -> authorize
//                .requestMatchers("/user/**").hasRole("USER")
//                .requestMatchers("/admin/**").hasRole("ADMIN")
//                .anyRequest().permitAll());

        // all 페이지는 인증만 되면 들어감, user 경로는 USER 권한을 가져야함, admin경로는 ADMIN 권한을 가짐, 나머지는 모두 허용
        http.authorizeHttpRequests(authorize -> authorize
                .requestMatchers("/all/**").authenticated()
                .requestMatchers("/user/**").hasAnyRole("USER", "ADMIN", "TESTER")
                .requestMatchers("/admin/**").hasRole("ADMIN")
                .anyRequest().permitAll());

        // 시큐리티가 제공하는 기본 폼 로그인 기능을 쓸 수 있다.
        // http.formLogin(Customizer.withDefaults());

        http.formLogin(form -> form.loginPage("/login")
                .loginProcessingUrl("/loginForm") // 클라이언트에서 보내는 로그인 요청 지정
                .defaultSuccessUrl("/hello") // 로그인 성공시 이동될 URL
        );
        return http.build();
    }
}
