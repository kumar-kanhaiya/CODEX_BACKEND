package com.CodexProject.CODEX.Service;

import com.CodexProject.CODEX.dto.RequireData;
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
    private SemesterRepository semesterRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private UnitRepository unitRepository;


    @Override
    public List<RequireData> getRequireData(Long semesterId, String subjectName) {
        return List.of();
    }
}
