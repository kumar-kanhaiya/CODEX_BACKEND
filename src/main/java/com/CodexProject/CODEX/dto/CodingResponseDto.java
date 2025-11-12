package com.CodexProject.CODEX.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CodingResponseDto {

    private String CodingName;

    private List<PartsDto> partsDtoList;

}
