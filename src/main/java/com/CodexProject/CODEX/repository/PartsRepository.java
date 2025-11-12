package com.CodexProject.CODEX.repository;

import com.CodexProject.CODEX.entity.Parts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartsRepository extends JpaRepository<Parts , Long> {
}
