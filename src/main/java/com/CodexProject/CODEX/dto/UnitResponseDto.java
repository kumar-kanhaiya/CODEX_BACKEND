package com.CodexProject.CODEX.dto;

import com.CodexProject.CODEX.entity.Subject;
import com.CodexProject.CODEX.entity.Unit;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UnitResponseDto {

    private String title;

    private String pdfUrl;


//    private List<Unit> units;

}
