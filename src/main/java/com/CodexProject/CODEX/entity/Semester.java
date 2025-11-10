package com.CodexProject.CODEX.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class Semester {

    @Id
    @SequenceGenerator(name = "id_seq"
            , sequenceName = "id_seq"
            , allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE
            , generator = "id_seq"
    )
    private long id;

    private int semester;

    @OneToMany(mappedBy = "semester" , cascade = CascadeType.ALL ,orphanRemoval = true)
    private List<Subject> subjects;
}
