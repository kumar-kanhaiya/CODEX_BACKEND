package com.CodexProject.CODEX.controller;

import com.CodexProject.CODEX.Service.CodingMaterialService;
import com.CodexProject.CODEX.dto.CodingDto;
import com.CodexProject.CODEX.dto.CodingResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/coding")
public class CodingMaterialController {

    @Autowired
    private CodingMaterialService codingMaterialService;

    @GetMapping("/{CodingName}")
    public ResponseEntity<CodingResponseDto> getCodingMaterial(
            @PathVariable String CodingName ){
        return ResponseEntity.ok(codingMaterialService.getCodingMaterial(CodingName));
    }

    @GetMapping("/all")
    public List<CodingDto> getAllCoding(){
        return codingMaterialService.getAllCoding();
    }

}
