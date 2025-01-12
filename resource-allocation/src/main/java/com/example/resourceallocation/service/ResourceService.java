package com.example.resourceallocation.service;

import com.example.resourceallocation.model.Resource;
import com.example.resourceallocation.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceService {

    @Autowired
    private ResourceRepository resourceRepository;

    public List<Resource> getResourcesBySkills(List<String> skills) {
        return resourceRepository.findAll().stream()
                .filter(resource -> resource.getSkills().containsAll(skills))
                .toList();
    }

    public List<Resource> getResourcesByExperienceAndSkills(List<String> skills, int maxExperience) {
        return resourceRepository.findAll().stream()
                .filter(resource -> resource.getExperience() < maxExperience && resource.getSkills().containsAll(skills))
                .toList();
    }
}
