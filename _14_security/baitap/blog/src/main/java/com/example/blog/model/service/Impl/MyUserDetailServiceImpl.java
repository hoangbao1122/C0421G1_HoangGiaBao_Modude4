package com.example.blog.model.service.Impl;

import com.example.blog.model.entity.MyUserDetail;
import com.example.blog.model.entity.User;
import com.example.blog.model.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class MyUserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private UserRespository userRespository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = this.userRespository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User name :" + username + "not fount");
        }
        return new MyUserDetail(user);
    }
}
