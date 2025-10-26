package com.CodexProject.CODEX.repository;

import com.CodexProject.CODEX.entity.Semester;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemesterRepo extends JpaRepository<Semester , Long> {
}
