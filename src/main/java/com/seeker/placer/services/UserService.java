//package com.seeker.placer.services;
//
//
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserService {
//    private UserRepository userRepository;
//    private RoleRepository roleRepository;
//    private RatingRepository ratingRepository;
//    private BCryptPasswordEncoder bCryptPasswordEncoder;
//
//    public UserService(UserRepository userRepository, RoleRepository roleRepository, RatingRepository ratingRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
//        this.userRepository = userRepository;
//        this.roleRepository = roleRepository;
//        this.ratingRepository = ratingRepository;
//        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
//    }
//
//
//    // 1 - user role
//    // USER STUFF
//    // 1 - user role
//    public void saveWithUserRole(User user) {
//        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
//        user.setRoles(roleRepository.findByName("ROLE_USER"));
//        userRepository.save(user);
//    }
//
//    //2 - admin role
//    public void saveWithAdminRole(User user) {
//        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
//        user.setRoles(roleRepository.findByName("ROLE_ADMIN"));
//        userRepository.save(user);
//    }
//
//    // 3 - find by name
//    public User findByUsername(String username) {
//        return userRepository.findByUsername(username);
//    }
//
//}
