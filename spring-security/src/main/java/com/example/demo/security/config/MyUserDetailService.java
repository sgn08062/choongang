package com.example.demo.security.config;


import com.example.demo.command.UserVO;
import com.example.demo.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    // 1. loginProcessURL로 로그인 경로를 등록
    // 2. 클라이언트에서 넘어오는 id 역할의 name값은 기본이 username
    //    form 태그의 name값을 변경하고 싶다면 설정 파일에 usernameParameter 등록하면 된다.
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("이거 실행됨 " + username);

        // 로그인 시도 코드를 작성
        UserVO vo = userMapper.login(username);

        if(vo==null){
            throw new UsernameNotFoundException("사용자를 찾을 수 없습니다");
        }

        return null; // 아이디가 있으면, 약속된 형태의 객체를 반환해주어야 함
    }
}
