package com.example.resource_allocation;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.resourceallocation.model.Resource;
import com.example.resourceallocation.repository.ResourceRepository;

@SpringBootApplication
public class ResourceAllocationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResourceAllocationApplication.class, args);
    }

    @Bean
    CommandLineRunner init(ResourceRepository repository) {
        return args -> {
            repository.save(new Resource(1L, "Dennis", 4, Arrays.asList("Java", "Spring", "JMS", "MySQL", "Angular", "React", "Web Services", "Nodejs")));
            repository.save(new Resource(2L, "Thompson", 7, Arrays.asList("Java", "Oracle", "React", "Angular", "JavaScript", "REST API")));
            repository.save(new Resource(3L, "Kim", 12, Arrays.asList("Java", "JSP", "Spring", "Oracle", "MySQL", "PostgreSQL", "Mongo", "REST API", "Web Services", "Docker", "Redis")));
            repository.save(new Resource(4L, "Aisha", 9, Arrays.asList("Angular", "JavaScript", "Nodejs", "REST API", "Web Services", "Docker", "SQL Server", "PostgreSQL")));
            repository.save(new Resource(5L, "Maya", 5, Arrays.asList("Spring", "Spring Boot", "Hibernate", "MySQL", "PostgreSQL", "Nodejs", "Python")));
            repository.save(new Resource(6L, "Kumar", 3, Arrays.asList("Java", "Redis", "MySQL", "JavaScript")));
        };
    }
}
