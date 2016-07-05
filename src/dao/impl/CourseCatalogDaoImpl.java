package dao.impl;

import org.hibernate.Query;

import dao.CourseCatalogDao;
import model.CourseCatalog;

public class CourseCatalogDaoImpl implements CourseCatalogDao {

	public CourseCatalog getByCourseCatalogId(int courseCatalogId) {
		Query query = getSessionFactory().getCurrentSession()
				.createQuery("select p from CourseCatalog p where courseCatalogId=:courseCatalogId")
				.setInteger("courseCatalogId", courseCatalogId);
		return (CourseCatalog) query.uniqueResult();
	}
}
