package com.example.resourceallocation.controller;

import com.example.resourceallocation.model.Resource;
import com.example.resourceallocation.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resources")
public class ResourceController {

    @Autowired
    private ResourceService resourceService;

    @GetMapping("/by-skills")
    public List<Resource> getResourcesBySkills(@RequestParam List<String> skills) {
        return resourceService.getResourcesBySkills(skills);
    }

    @GetMapping("/by-experience")
    public List<Resource> getResourcesByExperience(@RequestParam List<String> skills, @RequestParam int maxExperience) {
        return resourceService.getResourcesByExperienceAndSkills(skills, maxExperience);
    }
}
