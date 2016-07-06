package serviceImpl;

import java.util.List;

import dao.CourseCatalogDao;
import model.CourseCatalog;
import service.CourseCatalogService;

public class CourseCatalogServiceImpl implements CourseCatalogService
{
	private CourseCatalogDao courseCatalogDao;
	
	
	public void setCourseCatalogDao(CourseCatalogDao courseCatalogDao)
	{
		this.courseCatalogDao = courseCatalogDao;
	}

	@Override
	public int addCourseCatalog(CourseCatalog courseCatalog)
	{
		return (Integer) courseCatalogDao.save(courseCatalog);
	}

	@Override
	public List<CourseCatalog> getAllCourseCatalogs()
	{
		return courseCatalogDao.findAll(CourseCatalog.class);
	}

	@Override
	public void deleteCourseCatalog(int courseCatalogId)
	{
		courseCatalogDao.delete(CourseCatalog.class, courseCatalogId);
	}

	@Override
	public CourseCatalog getByCourseCatalogId(int courseCatalogId) {
		return courseCatalogDao.getByCourseCatalogId(courseCatalogId);
	}


}
