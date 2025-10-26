package com.CodexProject.CODEX.controller;

import com.CodexProject.CODEX.Dto.MinimalResponseDto;
import com.CodexProject.CODEX.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MaterialController {

    @Autowired
    private MaterialService service;

    @GetMapping("/{id}")
    public List<MinimalResponseDto> getSubjectMaterialBySemester(@PathVariable Long id){
        return service.getSubjectMaterialBySemester(id);
    }

}
