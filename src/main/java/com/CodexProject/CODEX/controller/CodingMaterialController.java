package com.CodexProject.CODEX.controller;

import com.CodexProject.CODEX.Service.CodingMaterialService;
import com.CodexProject.CODEX.dto.CodingResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/coding")
public class CodingMaterialController {

    @Autowired
    private CodingMaterialService codingMaterialService;

    @GetMapping("/{CodingName}/{playlistName}")
    public ResponseEntity<CodingResponseDto> getCodingMaterial(
            @PathVariable String CodingName ,
            @PathVariable String playlistName){
        return ResponseEntity.ok(codingMaterialService.getCodingMaterial(CodingName , playlistName));
    }

}
