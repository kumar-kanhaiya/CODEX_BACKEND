package com.CodexProject.CODEX.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SemesterDto {

    private int semester ;

    private List<SubjectDto> subjectDtoList;
}
