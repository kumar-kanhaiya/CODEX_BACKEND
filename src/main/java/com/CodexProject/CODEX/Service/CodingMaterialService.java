package com.CodexProject.CODEX.Service;

import com.CodexProject.CODEX.dto.CodingResponseDto;
import org.springframework.stereotype.Service;


public interface CodingMaterialService {
    public CodingResponseDto getCodingMaterial(String codingName, String playlistName);
}
