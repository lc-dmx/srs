package daoImpl;

import java.util.List;

import org.hibernate.Query;

import dao.TranscriptEntryDao;
import model.Section;
import model.TranscriptEntry;

public class TranscriptEntryDaoImpl implements TranscriptEntryDao {

	@Override
	public List<TranscriptEntry> getBySection(Section section) {
		return find(" from  TranscriptEntry where section_id=" + section.getSectionNo());
	}

	public TranscriptEntry getByTranscriptEntryId(int transcriptEntryId) {
		Query query = getSessionFactory().getCurrentSession()
				.createQuery("select t from TranscriptEntry t where transcriptEntryId=:transcriptEntryId")
				.setInteger("transcriptEntryId", transcriptEntryId);
		return (TranscriptEntry) query.uniqueResult();
	}
}
