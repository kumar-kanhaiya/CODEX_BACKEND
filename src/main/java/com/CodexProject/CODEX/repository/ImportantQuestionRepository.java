package com.CodexProject.CODEX.repository;

import com.CodexProject.CODEX.entity.ImportantQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImportantQuestionRepository extends JpaRepository<ImportantQuestion , Long> {

}
