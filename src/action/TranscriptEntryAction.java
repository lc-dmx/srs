package action;

import java.util.HashMap;
import java.util.Map;

import model.TranscriptEntry;
import service.TranscriptEntryService;

public class TranscriptEntryAction extends BaseAction<TranscriptEntry>{
	private TranscriptEntryService transcriptEntryService;
	private Map<String, Object> jsonMap=new HashMap<>();
	public void setTranscriptEntryService(TranscriptEntryService transcriptEntryService) {
		this.transcriptEntryService = transcriptEntryService;
	}
	public TranscriptEntryService getTranscriptEntryService() {
		return transcriptEntryService;
	}
	public void setJsonMap(Map<String, Object> jsonMap) {
		this.jsonMap = jsonMap;
	}
	public Map<String, Object> getJsonMap() {
		return jsonMap;
	}
}
