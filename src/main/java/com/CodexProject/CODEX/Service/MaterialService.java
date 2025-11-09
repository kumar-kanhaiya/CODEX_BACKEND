package com.CodexProject.CODEX.Service;

import com.CodexProject.CODEX.dto.SubjectResponseDto;

public interface MaterialService {
    public SubjectResponseDto getSubjectMaterial(Long semesterId, String subjectName);
}
