package com.CodexProject.CODEX.repository;

import com.CodexProject.CODEX.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<Subject , Long> {

    Subject findSubjectByTitle(String title);

}
