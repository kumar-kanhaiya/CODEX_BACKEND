package com.CodexProject.CODEX.service.serviceImpl;

import com.CodexProject.CODEX.repository.SemesterRepo;
import com.CodexProject.CODEX.repository.SubjectMaterialRepository;
import com.CodexProject.CODEX.repository.SubjectRepository;
import com.CodexProject.CODEX.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaterialServiceImpl implements MaterialService {

    @Autowired
    private SemesterRepo semesterRepo;

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private SubjectMaterialRepository subjectMaterialRepository;


//    @Override
//    public List<MinimalResponseDto> getSubjectMaterialBySemester(Long id) {
//        Semester semester = semesterRepo.findById(id)
//                .orElseThrow(() -> new RuntimeException("Please enter a valid id"));
//
//        return semester.getSubject().stream().map(subject ->
//                MinimalResponseDto
//                        .builder()
//                        .subjectName(subject.getTitle())
//                        .materialUrl(subject.getSubjectMaterial() != null ? subject.getSubjectMaterial().getUrl() : null)
//                        .build()).toList();
//    }


}
