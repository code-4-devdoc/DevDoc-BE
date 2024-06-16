package com.devdoc.backend.repository;

import com.devdoc.backend.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer> {
    List<Skill> findByResumeId(int resumeId);
    void deleteByResumeId(int resumeId);
}
