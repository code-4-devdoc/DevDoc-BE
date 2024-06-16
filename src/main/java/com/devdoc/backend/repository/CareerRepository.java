package com.devdoc.backend.repository;

import com.devdoc.backend.model.Career;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CareerRepository extends JpaRepository<Career, Integer> {
    List<Career> findByResumeId(int resumeId);
    void deleteByResumeId(int resumeId);
}
