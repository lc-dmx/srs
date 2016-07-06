package daoImpl;

import org.hibernate.Query;

import dao.TranscriptDao;
import model.Transcript;

public class TranscriptDaoImpl   implements TranscriptDao {

	public Transcript getByTranscriptId(int transcriptId) {
		Query query = getSessionFactory().getCurrentSession()
				.createQuery("select t from Transcript t where transcriptId=:transcriptId")
				.setInteger("transcriptId", transcriptId);
		return (Transcript) query.uniqueResult();
	}
}
