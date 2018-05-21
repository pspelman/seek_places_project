package com.seeker.placer.repositories;

import com.seeker.placer.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    public List<User> findAll();

    User findByUsername(String username);

}
