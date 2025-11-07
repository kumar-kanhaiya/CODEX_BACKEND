package com.CodexProject.CODEX.Dto;

import com.CodexProject.CODEX.entity.Subject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UnitDto {

    private String title;

    private String link ;

    private SubjectDto subjectDto;
}
