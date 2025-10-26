package com.CodexProject.CODEX.service;

import com.CodexProject.CODEX.Dto.MinimalResponseDto;

import java.util.List;

public interface MaterialService {


    public List<MinimalResponseDto> getSubjectMaterialBySemester(Long id);
}
