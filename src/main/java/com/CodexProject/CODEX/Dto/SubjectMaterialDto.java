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
public class SubjectMaterialDto {

    private String url;

    private long subjectId;

}
