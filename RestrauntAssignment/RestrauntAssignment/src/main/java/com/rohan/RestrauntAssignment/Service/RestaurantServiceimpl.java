package com.rohan.RestrauntAssignment.Service;

import com.rohan.RestrauntAssignment.Dao.RestaurantDao;
import com.rohan.RestrauntAssignment.Entity.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class RestaurantServiceimpl implements RestaurantService{


    @Autowired
    private RestaurantDao restroDao;


    @Override
    public String bookRestro(List<Restaurant> restros) {
        restroDao.saveAll(restros);
        return "Succesfully saved restaurants"+restros.size();
    }

    @Override
    public List<Restaurant> getRestros() {
        return (List<Restaurant>)restroDao.findAll();
    }

    @Override
    public Optional<Restaurant> getRestro(Integer restroId) {
        return (Optional<Restaurant>) restroDao.findById(restroId);
    }

    @Override
    public String updateRestro(Restaurant restro) {
        restroDao.save(restro);
        return "updated";
    }

    @Override
    public String deleteRestro(Integer id) {
        restroDao.deleteById(id);
        return "Restaurant deleted";
    }
}
