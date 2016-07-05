package service;

import java.util.List;

import model.ScheduleOfClasses;

public interface ScheduleOfClassesService {

	int addScheduleOfClasses(ScheduleOfClasses scheduleOfClasses);

	List<ScheduleOfClasses> getAllScheduleOfClasses();

	void deleteScheduleOfClasses(int scheduleOfClassesId);
}
