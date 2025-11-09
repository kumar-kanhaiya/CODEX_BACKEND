package com.CodexProject.CODEX.controller;

import com.CodexProject.CODEX.Service.MaterialService;
import com.CodexProject.CODEX.dto.SubjectResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/materials")
@RequiredArgsConstructor
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @GetMapping("/{semesterId}/{subjectName}")
    public ResponseEntity<SubjectResponseDto> getMaterials(
            @PathVariable Long semesterId,
            @PathVariable String subjectName) {

        return ResponseEntity.ok(materialService.getSubjectMaterial(semesterId, subjectName));
    }


}
