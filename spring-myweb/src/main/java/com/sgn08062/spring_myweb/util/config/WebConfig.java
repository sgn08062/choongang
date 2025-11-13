package com.sgn08062.spring_myweb.util.config;

import com.sgn08062.spring_myweb.util.interceptor.UserAuthHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // 스프링 설정파일로 사용
public class WebConfig implements WebMvcConfigurer {

    // 스프링에 빈으로 등록
    @Bean
    public UserAuthHandler userAuthHandler(){
        return new UserAuthHandler();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor( userAuthHandler() ) // 실행시킬 인터셉트 클래스 등록
                //.addPathPatterns("/**"); // 모든경로
                .addPathPatterns("/user/**") // user로 시작하는 경로
                .addPathPatterns("/product/**") // product로 시작하는 경로
                .excludePathPatterns("/user/login") // user/login 경로는 제외
                .excludePathPatterns("/user/logout") // 제외
                .excludePathPatterns("/user/join"); // 제외

        // registry.addInterceptor( ... ) // 하나 더 추가하고 싶으면
    }
}
