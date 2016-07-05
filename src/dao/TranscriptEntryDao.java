package dao;

import java.util.List;

import model.Section;
import model.TranscriptEntry;

public interface TranscriptEntryDao  {

	public TranscriptEntry getByTranscriptEntryId(int transcriptEntryId);

	public List<TranscriptEntry> getBySection(Section section);
}
