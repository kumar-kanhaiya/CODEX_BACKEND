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
public class Subject {

    @Id
    @SequenceGenerator(name = "id_seq"
            , sequenceName = "id_seq"
            , allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "id_seq")
    private long id;

    private String title;

    private String about;

    private String imgUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "semester_id" , nullable = false)
    private Semester semester;

    @OneToMany(mappedBy = "subject", cascade = CascadeType.ALL)
    private List<Unit> units;

    @OneToOne(mappedBy = "subject" , cascade = CascadeType.ALL)
    private ImportantQuestion importantQuestion;

}
