package service;

import java.util.List;

import model.Section;

public interface SectionService {

	int addSection(Section section);

	List<Section> getAllSections();

	void deleteSection(int sectionNo);

	Section getBySectionNo(int sectionNo);
}
