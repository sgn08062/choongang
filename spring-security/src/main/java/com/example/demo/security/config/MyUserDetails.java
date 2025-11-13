package com.example.demo.security.config;

import com.example.demo.command.UserVO;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// 이 객체는 화면에서 전달하는 값을 포함하도록 처리하고, 반드시 변수에 대한 getter 생성을 해줘야함
// 이 객체를 스프링이 반환으로 받아가서 비밀번호, 권한을 검증할 때 사용함.
public class MyUserDetails implements UserDetails {

    // VO객체
    private UserVO userVO;

    // 생성자
    public MyUserDetails(UserVO userVO) {
        this.userVO = userVO;
    }

    // 사용자의 권한을 리스트 형태로 구현해서 담아서 반환
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> list = new ArrayList<>();
        list.add(new GrantedAuthority() {
            @Override
            public String getAuthority() {
                return userVO.getRole();
            }
        });

        return list;
    }

    @Override
    public String getPassword() {
        return userVO.getPassword();
    }

    @Override
    public String getUsername() {
        return userVO.getUsername();
    }
}
