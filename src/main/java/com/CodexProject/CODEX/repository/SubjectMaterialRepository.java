package com.CodexProject.CODEX.repository;

//import com.CodexProject.CODEX.entity.SubjectMaterial;
import com.CodexProject.CODEX.entity.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectMaterialRepository extends JpaRepository<Unit, Long> {

}
