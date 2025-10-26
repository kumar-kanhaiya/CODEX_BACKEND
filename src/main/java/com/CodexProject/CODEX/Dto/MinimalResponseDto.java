package com.CodexProject.CODEX.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MinimalResponseDto {

    private String subjectName;

    private String materialUrl;
}
