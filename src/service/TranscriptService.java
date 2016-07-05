package service;

import java.util.List;

import model.Transcript;

public interface TranscriptService {

	int addTranscript(Transcript transcript);

	List<Transcript> getAllTranscripts();

	void deleteTranscript(int transcriptId);
}
