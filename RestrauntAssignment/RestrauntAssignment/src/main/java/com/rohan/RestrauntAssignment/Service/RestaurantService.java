package com.rohan.RestrauntAssignment.Service;

import com.rohan.RestrauntAssignment.Entity.Restaurant;
import com.rohan.RestrauntAssignment.Service.RestaurantService;

import java.util.List;
import java.util.Optional;

public interface RestaurantService {

    String bookRestro(List<Restaurant> restros);

    List<Restaurant> getRestros();

    Optional<Restaurant> getRestro(Integer restroId);

    String updateRestro(Restaurant restro);

    String deleteRestro(Integer id);
}
