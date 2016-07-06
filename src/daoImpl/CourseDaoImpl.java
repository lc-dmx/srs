package daoImpl;

import org.hibernate.Query;

import dao.CourseDao;
import model.Course;

public class CourseDaoImpl implements CourseDao {

	public Course getByCourseId(int courseId) {
		Query query = getSessionFactory().getCurrentSession()
				.createQuery("select p from Course p where courseId=:courseId").setInteger("courseId", courseId);
		return (Course) query.uniqueResult();
	}
}
