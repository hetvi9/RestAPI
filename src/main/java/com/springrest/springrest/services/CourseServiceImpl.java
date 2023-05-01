package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;

	/* List<Course> list; */
	public CourseServiceImpl()
	{
		/*
		 * list = new ArrayList<>(); list.add(new
		 * Course(145,"java course","contains rest api")); list.add(new
		 * Course(146,"java course 2","contains rest api 2"));
		 */
	}
	@Override
	public List<Course> getCourse() {
		return courseDao.findAll();
		
	}
	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		/*
		 * Course c = null; for(Course course:list) { if(course.getId() == courseId) {
		 * c=course; break; } }
		 */
		return courseDao.getReferenceById(courseId);
	}
	@Override
	public Course addCourse(Course course) {
		
	
		//list.add(course);
		courseDao.save(course);
		return course;
		/*
		 * list.add(course); return course;
		 */
	}
	@Override
	public Course updateCourse(Course course) {
		
		courseDao.save(course);
		return course;
		
		/* list.forEach(e -> { */
			/*if(e.getId() == course.getId())
			{
				e.setTitle(course.getTitle());
				e.setDescription(course.getDescription());
			}
		});
		return course;*/
	}
	@Override
	public void deleteCourse(long parseLong) {
		Course entity = courseDao.getReferenceById(parseLong);
		courseDao.delete(entity);
		// TODO Auto-generated method stub
		/*
		 * list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.
		 * toList());
		 */
	}

}
