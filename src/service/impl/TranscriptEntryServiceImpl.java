package service.impl;

import java.util.List;

import dao.TranscriptEntryDao;
import model.TranscriptEntry;
import service.TranscriptEntryService;


public class TranscriptEntryServiceImpl   implements TranscriptEntryService{
	
	private TranscriptEntryDao transcriptEntryDao;
	
	public void setTranscriptEntryDao(TranscriptEntryDao transcriptEntryDao) {
		this.transcriptEntryDao = transcriptEntryDao;
	}

	@Override
	public int addTranscriptEntry(TranscriptEntry transcriptEntry) {
		// TODO Auto-generated method stub
		return (Integer) transcriptEntryDao.save(transcriptEntry);
	}

	@Override
	public List<TranscriptEntry> getAllTranscriptEntrys() {
		// TODO Auto-generated method stub
		return transcriptEntryDao.findAll(TranscriptEntry.class);
	}

	@Override
	public void deleteTranscriptEntry(int transcriptEntryId) {
		// TODO Auto-generated method stub
		transcriptEntryDao.delete(TranscriptEntry.class, transcriptEntryId);;
	}


}
