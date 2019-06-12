package com.capgemini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.CourseDao;
import com.capgemini.entity.CourseEntity;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	CourseDao courseDao;
	
	@Override
	public CourseEntity addNewCourse(CourseEntity courseEntity) {
		
		CourseEntity ITransform = courseDao.insert(courseEntity);
		return ITransform;
//		return iTranformDao.insert(itransForm);
	}


	

}
