package com.CodexProject.CODEX.controller;

import com.CodexProject.CODEX.Service.MaterialService;
import com.CodexProject.CODEX.dto.RequireData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("notes")
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @GetMapping("/semester/{semsterid}/subject/{subjectname}")
    private List<RequireData> getRequireData(@RequestParam Long semesterId
            , String subjectName){
        return materialService.getRequireData(semesterId , subjectName);

    }


}
