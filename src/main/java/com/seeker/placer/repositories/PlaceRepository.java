package com.seeker.placer.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seeker.placer.models.Place;

@Repository
public interface PlaceRepository extends JpaRepository<Place, Long> {
	List<Place> findAll();
}
