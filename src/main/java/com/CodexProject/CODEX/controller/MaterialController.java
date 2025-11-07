package com.CodexProject.CODEX.controller;

import com.CodexProject.CODEX.Dto.RequiredData;
import com.CodexProject.CODEX.service.MaterialService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
@RequiredArgsConstructor
public class MaterialController {

    @Autowired
    private MaterialService service;

//    public List<>

    @GetMapping("/semester/{semesterId}/subject/{subjectName}")
    public List<RequiredData> getRequireData(@RequestParam  Long semesterId , @RequestParam String subjectName){
        return service.getRequireData(semesterId , subjectName);
    }

}
