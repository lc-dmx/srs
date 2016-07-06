package daoImpl;

import org.hibernate.Query;

import dao.ScheduleOfClassesDao;
import model.ScheduleOfClasses;

public class ScheduleOfClassesDaoImpl   implements ScheduleOfClassesDao {
	
	public ScheduleOfClasses getByScheduleOfClassesId(int scheduleOfClassesId) {
		Query query = getSessionFactory().getCurrentSession()
				.createQuery("select s from ScheduleOfClasses s where scheduleOfClassesId=:scheduleOfClassesId").setInteger("scheduleOfClassesId", scheduleOfClassesId);
		return (ScheduleOfClasses) query.uniqueResult();
	}
	
}
