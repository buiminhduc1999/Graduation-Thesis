package com.buiminhduc.util;

import com.buiminhduc.model.request.UserRequest;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.ArrayList;
import java.util.List;

public class SecurityUtils {
    public static UserRequest getPrincipal() {
        UserRequest userRequest = (UserRequest) (SecurityContextHolder.getContext()).getAuthentication().getPrincipal();
        return userRequest;
    }
    @SuppressWarnings("unchecked")
    public static List<String> getAuthorities(){
        //lấy ra 1 mảng role từ granted
        List<String> results = new ArrayList<>();
        List<GrantedAuthority> authorities = (List<GrantedAuthority>)(SecurityContextHolder.getContext().getAuthentication().getAuthorities());
        for (GrantedAuthority authority : authorities) {
            results.add(authority.getAuthority());
        }
        return results;
    }
}
