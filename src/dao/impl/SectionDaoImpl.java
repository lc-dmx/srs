package dao.impl;

import org.hibernate.Query;

import dao.SectionDao;
import model.Section;

public class SectionDaoImpl   implements SectionDao {

	public Section getBySectionNo(int sectionNo) {
		Query query = getSessionFactory().getCurrentSession()
				.createQuery("select s from Section s where sectionNo=:sectionNo").setInteger("sectionNo", sectionNo);
		return (Section) query.uniqueResult();
	}

}
