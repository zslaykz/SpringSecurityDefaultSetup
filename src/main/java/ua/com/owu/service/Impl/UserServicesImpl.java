package ua.com.owu.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.owu.dao.UserDao;
import ua.com.owu.entity.User;
import ua.com.owu.service.UserService;

import java.util.List;
@Transactional

public class UserServicesImpl implements UserService, UserDetailsService{

    @Autowired
    private UserDao dao;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void save(User user) {
        String password = user.getPassword();
        String encode = passwordEncoder.encode(password);
        user.setPassword(encode);
        dao.save(user);

    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findByUserName(String name) {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return findByUserName(username);
    }
}
