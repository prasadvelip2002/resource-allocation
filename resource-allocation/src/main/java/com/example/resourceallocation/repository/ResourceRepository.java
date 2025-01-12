package com.example.resourceallocation.repository;

import com.example.resourceallocation.model.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
    List<Resource> findBySkillsContaining(String skill);
    List<Resource> findByExperienceLessThan(int experience);
}
