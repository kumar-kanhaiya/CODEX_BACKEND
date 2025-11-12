package com.CodexProject.CODEX.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PartsDto {

    private String playlistName;

    private String playlistUrl;

    private String imageUrl;
}
