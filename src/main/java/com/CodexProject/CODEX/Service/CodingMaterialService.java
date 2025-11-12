package com.CodexProject.CODEX.Service;

import com.CodexProject.CODEX.dto.CodingDto;
import com.CodexProject.CODEX.dto.CodingResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CodingMaterialService {
    public CodingResponseDto getCodingMaterial(String codingName);

    public List<CodingDto> getAllCoding();
}
