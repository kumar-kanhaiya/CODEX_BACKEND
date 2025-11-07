package com.CodexProject.CODEX.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class SubjectDto {

    private String title;

    private String img;

    private String about;

    private SemesterDto semesterDto;

    private List<UnitDto> unitDtoList;
}
