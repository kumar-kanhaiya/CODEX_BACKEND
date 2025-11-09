package com.CodexProject.CODEX.Service;

import com.CodexProject.CODEX.dto.SubjectResponseDto;
import com.CodexProject.CODEX.dto.UnitResponseDto;
import com.CodexProject.CODEX.entity.Semester;
import com.CodexProject.CODEX.entity.Subject;
import com.CodexProject.CODEX.repository.ImportantQuestionRepository;
import com.CodexProject.CODEX.repository.SemesterRepository;
import com.CodexProject.CODEX.repository.SubjectRepository;
import com.CodexProject.CODEX.repository.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialServiceImpl implements MaterialService{

    @Autowired
    private ImportantQuestionRepository importantQuestionRepository;

    @Autowired
    private SemesterRepository semesterRepo;

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private UnitRepository unitRepository;

    @Override
    public SubjectResponseDto getSubjectMaterial(Long semesterId, String subjectName) {
        Semester semester = semesterRepo.findById(semesterId)
                .orElseThrow(() -> new RuntimeException("Invalid Semester ID"));

        Subject subject = semester.getSubjects().stream()
                .filter(s -> s.getTitle().equalsIgnoreCase(subjectName))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Subject not found"));

        List<UnitResponseDto> unitDtos = subject.getUnits()
                .stream()
                .map(unit -> UnitResponseDto.builder()
                        .title(unit.getTitle())
                        .pdfUrl(unit.getPdfUrl())
                        .build())
                .toList();

        return SubjectResponseDto.builder()
                .title(subject.getTitle())
                .about(subject.getAbout())
                .imageUrl(subject.getImgUrl())
                .units(unitDtos)
                .importantQuestion(
                        subject.getImportantQuestion() != null ?
                                subject.getImportantQuestion().getPdfUrl() : null)
                .build();
    }
}
