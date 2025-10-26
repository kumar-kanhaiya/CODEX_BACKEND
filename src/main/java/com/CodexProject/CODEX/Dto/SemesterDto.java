package com.CodexProject.CODEX.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SemesterDto {


    private int semester;


    private List<SubjectDto> subjects;
}
