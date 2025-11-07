package com.CodexProject.CODEX.Dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequiredData {

    private String img;

    private String title;

    private String about;

    private String link;

}
