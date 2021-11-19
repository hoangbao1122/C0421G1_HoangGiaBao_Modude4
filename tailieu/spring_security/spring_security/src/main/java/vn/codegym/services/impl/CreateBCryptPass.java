package vn.codegym.services.impl;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/*File này dùng để tạo pass đã được mã hóa*/
public class CreateBCryptPass {
    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        System.out.println(bCryptPasswordEncoder.encode("123"));
    }
}
