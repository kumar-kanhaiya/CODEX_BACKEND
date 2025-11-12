package com.CodexProject.CODEX.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Parts {

    @Id
    @SequenceGenerator(name = "id_seq"
            , sequenceName = "id_seq"
            , allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE
            , generator = "id_seq")
    private Long id ;

    private String playlistName;

    private String playlistUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Coding_Material" , nullable = false)
    private Coding coding;
}
