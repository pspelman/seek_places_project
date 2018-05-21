//package com.seeker.placer.services;
//
//import com.seeker.placer.models.Role;
//import com.seeker.placer.models.User;
//import com.seeker.placer.repositories.UserRepository;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//@Service
//public class UserDetailServiceImplementation implements UserDetailsService {
//    private UserRepository userRepository;
//
//    public UserDetailServiceImplementation(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepository.findByUsername(username);
//
//        if (user == null) {
//            throw new UsernameNotFoundException("Username not found");
//        } else {
//            return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), getAuthorities(user));
//        }
//
//    }
//
//    private List<GrantedAuthority> getAuthorities(User user) {
//        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
//        for (Role r : user.getRoles()) {
//            GrantedAuthority g = new SimpleGrantedAuthority(r.getName());
//            authorities.add(g);
//        }
//        return authorities;
//    }
//
//
//}
