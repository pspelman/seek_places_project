package com.seeker.placer.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.seeker.placer.models.Place;
import com.seeker.placer.repositories.PlaceRepository;

@Service
public class UserService {
	
	private PlaceRepository placeRepository;
	
	public UserService(PlaceRepository placeRepository) {
		this.placeRepository = placeRepository;
	}
	
	public List<Place> allPlaces(){
		return placeRepository.findAll();
	}
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
}
