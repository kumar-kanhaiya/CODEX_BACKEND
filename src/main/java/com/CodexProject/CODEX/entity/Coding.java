package com.CodexProject.CODEX.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Coding {

    @Id
    @SequenceGenerator(name = "id_seq"
            , sequenceName = "id_seq"
            , allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE
            , generator = "id_seq")
    private Long id ;

    private String CodingName;

    @OneToMany(mappedBy = "coding")
    private List<Parts> parts;
}
