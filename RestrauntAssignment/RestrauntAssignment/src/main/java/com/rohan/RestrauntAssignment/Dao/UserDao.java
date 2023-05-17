package com.rohan.RestrauntAssignment.Dao;

import com.rohan.RestrauntAssignment.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User,Integer> {

}
