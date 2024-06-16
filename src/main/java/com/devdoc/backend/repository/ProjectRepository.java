package com.devdoc.backend.repository;

import com.devdoc.backend.model.Project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
    List<Project> findByResumeId(int resumeId);
    void deleteByResumeId(int resumeId);
}
