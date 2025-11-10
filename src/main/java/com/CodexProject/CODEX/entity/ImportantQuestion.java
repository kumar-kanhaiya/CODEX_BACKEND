package com.CodexProject.CODEX.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImportantQuestion {

    @Id
    @SequenceGenerator(name = "id_seq"
            , sequenceName = "id_seq"
            , allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE
            , generator = "id_seq"
    )
    private long id;

//    private String title;
    private String pdfUrl;

    @OneToOne
    @JoinColumn(name = "subject_id" , nullable = false)
    private Subject subject;
}
