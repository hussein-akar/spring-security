package com.example.security.security;

import com.example.security.domain.Authority;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@RequiredArgsConstructor
public class CustomAuthority implements GrantedAuthority {

    private final Authority authority;

    @Override
    public String getAuthority() {
        return authority.getName();
    }

    @Override
    public String toString() {
        return "CustomAuthority{" +
            "authority=" + authority.getName() +
            '}';
    }
}