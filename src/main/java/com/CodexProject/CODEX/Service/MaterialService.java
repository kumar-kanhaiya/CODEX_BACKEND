package com.CodexProject.CODEX.Service;

import com.CodexProject.CODEX.dto.RequireData;

import java.util.List;

public interface MaterialService {
    public List<RequireData> getRequireData(Long semesterId, String subjectName);
}
