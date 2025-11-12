package com.CodexProject.CODEX.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CodingDto {

    private String codingName;

    private String about;

    private String imageUrl;
}
