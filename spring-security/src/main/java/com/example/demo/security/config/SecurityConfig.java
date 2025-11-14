package com.example.demo.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true) //어노테이션으로 권한설정을 활성화 합니다.
public class SecurityConfig {

    @Autowired
    private MyUserDetailService myUserDetailService;

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

        http.formLogin(form -> form
                .loginPage("/login")  //사용자가 제공하는 폼기반 로그인 기능을 사용
                .loginProcessingUrl("/loginForm") // 클라이언트에서 보내는 로그인 요청 지정
                //.failureUrl("/login?error=true") // 로그인 실패 시 url
                .failureHandler(customAuthenticationFail())
                .defaultSuccessUrl("/hello") // 로그인 성공시 이동될 URL
        );

        // 권한없음 페이지에 대한 처리
        http.exceptionHandling(ex ->
                ex.accessDeniedHandler(customAccessDenyHandler())
        );

        // 로그아웃 처리
        http.logout(logout -> logout
                .logoutUrl("/logout") // 로그아웃 처리할 url
                .logoutSuccessUrl("/login")  // 로그아웃 이후에 보여질 페이지
        );

        // 리멤버 미
        http.rememberMe(remember -> remember
                .key("decoy") // 쿠키를 생성할 때 사용하게 되는 비밀키
                .rememberMeParameter("remember-me") // 화면에서 넘어오는 name값
                .tokenValiditySeconds(3600) // 쿠키의 수명
                .userDetailsService(myUserDetailService) // 리멤버미 성공하면 실행시킬 클래스
        );
        return http.build();
    }

    @Bean
    public CustomAuthenticationFailure customAuthenticationFail(){
        return new CustomAuthenticationFailure("/login"); // 로그인 실패시 처리
    }

    @Bean
    public CustomAccessDenyHandler customAccessDenyHandler(){
        return new CustomAccessDenyHandler("/hello"); // 권한이 없을때 처리
    }
}
