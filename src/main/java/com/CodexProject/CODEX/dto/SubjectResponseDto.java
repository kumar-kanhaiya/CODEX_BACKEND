package com.CodexProject.CODEX.dto;

import com.CodexProject.CODEX.entity.ImportantQuestion;
import com.CodexProject.CODEX.entity.Semester;
import com.CodexProject.CODEX.entity.Unit;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SubjectResponseDto {

    private String title;

    private String about;

    private String imageUrl;

//    private Semester semester;

    private List<UnitResponseDto> units;

    private String importantQuestion;

}
