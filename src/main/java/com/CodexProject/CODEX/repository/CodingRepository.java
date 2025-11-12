package com.CodexProject.CODEX.repository;

import com.CodexProject.CODEX.entity.Coding;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodingRepository extends JpaRepository<Coding , Long > {

    Coding findByName(String name);

}
