package com.capgemini.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.entity.CourseEntity;

@Repository
public interface CourseDao extends MongoRepository<CourseEntity, String> {

}
