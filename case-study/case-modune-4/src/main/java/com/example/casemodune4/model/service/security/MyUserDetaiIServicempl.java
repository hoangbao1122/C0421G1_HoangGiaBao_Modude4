package com.example.casemodune4.model.service.security;

import com.example.casemodune4.model.entity.user.MyUserDetail;
import com.example.casemodune4.model.entity.user.User;
import com.example.casemodune4.model.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetaiIServicempl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = this.userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User name " + username + "not fount");
        }
        return new MyUserDetail(user);
    }
}
