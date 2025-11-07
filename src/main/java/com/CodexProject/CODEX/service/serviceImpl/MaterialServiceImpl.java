package com.CodexProject.CODEX.service.serviceImpl;

import com.CodexProject.CODEX.Dto.RequiredData;
import com.CodexProject.CODEX.Dto.SemesterDto;
import com.CodexProject.CODEX.entity.Semester;
import com.CodexProject.CODEX.entity.Subject;
import com.CodexProject.CODEX.entity.Unit;
import com.CodexProject.CODEX.repository.SemesterRepo;
import com.CodexProject.CODEX.repository.SubjectMaterialRepository;
import com.CodexProject.CODEX.repository.SubjectRepository;
import com.CodexProject.CODEX.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class MaterialServiceImpl implements MaterialService {

    @Autowired
    private SemesterRepo semesterRepo;

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private SubjectMaterialRepository subjectMaterialRepository;
    @Autowired
    private RestClient.Builder builder;

    @Override
    public List<RequiredData> getRequireData(Long semesterId, String subjectName) {
        Semester semester = semesterRepo.findBySemester(Math.toIntExact(semesterId));
        Subject subject = subjectRepository.findSubjectByTitle(subjectName);
        Unit unit = subjectMaterialRepository.findById(subject.getId());


    }


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
