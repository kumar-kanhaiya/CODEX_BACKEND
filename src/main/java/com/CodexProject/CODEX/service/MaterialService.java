package com.CodexProject.CODEX.service;

import com.CodexProject.CODEX.Dto.RequiredData;

import java.util.List;

public interface MaterialService {
    public List<RequiredData> getRequireData(Long semesterId, String subjectName);


//    public List<MinimalResponseDto> getSubjectMaterialBySemester(Long id);
}
