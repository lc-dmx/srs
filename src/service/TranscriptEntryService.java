package service;

import java.util.List;

import model.TranscriptEntry;

public interface TranscriptEntryService {

	int addTranscriptEntry(TranscriptEntry transcriptEntry);

	List<TranscriptEntry> getAllTranscriptEntrys();

	void deleteTranscriptEntry(int transcriptEntryId);
}
