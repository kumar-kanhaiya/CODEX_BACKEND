package com.CodexProject.CODEX.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Semester {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;

    @NotNull
    private int semester;

    @OneToMany(
            mappedBy = "semester",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Subject> subject;

}
