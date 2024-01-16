package com.itv.project.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.itv.project.entites.Configuration;

public interface ConfigurationRepository extends MongoRepository<Configuration, String> {
    Configuration getConfigurationById(String id);
    void updateRemarkById(String id, String remark);
}
