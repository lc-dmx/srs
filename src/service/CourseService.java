package service;

import java.util.List;

import model.Course;

public interface CourseService
{
	
	int addCourse(Course course);

	List<Course> getAllCourses();
	
	void deleteCourse(int courseId);
	
	Course getByCourseId(int courseId);
}
 