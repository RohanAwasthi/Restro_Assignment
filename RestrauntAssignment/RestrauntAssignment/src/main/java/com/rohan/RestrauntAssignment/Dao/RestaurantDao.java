package com.rohan.RestrauntAssignment.Dao;

import com.rohan.RestrauntAssignment.Entity.Restaurant;
import org.springframework.data.repository.CrudRepository;

public interface RestaurantDao extends CrudRepository<Restaurant,Integer> {
}
