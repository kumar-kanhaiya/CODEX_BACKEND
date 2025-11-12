package com.CodexProject.CODEX.Service;

import com.CodexProject.CODEX.dto.CodingResponseDto;
import com.CodexProject.CODEX.dto.PartsDto;
import com.CodexProject.CODEX.entity.Coding;
import com.CodexProject.CODEX.entity.Parts;
import com.CodexProject.CODEX.repository.CodingRepository;
import com.CodexProject.CODEX.repository.PartsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodingMaterialServiceImpl implements CodingMaterialService{

    @Autowired
    private CodingRepository codingRepository;

    @Autowired
    private PartsRepository partsRepository;

    @Override
    public CodingResponseDto getCodingMaterial(String codingName
            , String playlistName) {

        Coding coding = codingRepository.findByCodingName(codingName);

        List<PartsDto> partsList = coding.getParts()
                .stream().map(part -> PartsDto
                        .builder()
                        .playlistName(part.getPlaylistName())
                        .playlistUrl(part.getPlaylistUrl())
                        .build()).toList();

        return CodingResponseDto
                .builder()
                .CodingName(coding.getCodingName())
                .partsDtoList(partsList)
                .build();


    }
}
