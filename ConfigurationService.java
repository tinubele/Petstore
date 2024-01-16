package com.itv.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itv.project.entites.Configuration;
import com.itv.project.repositories.ConfigurationRepository;


@Service
public class ConfigurationService {

    @Autowired
    private ConfigurationRepository configurationRepository;

    /**
     * @param id
     * @return
     */
    public List<List<String>> getConfigurations(String id) {
        // Implement logic to fetch configurations from MongoDB based on id
        // You can use configurationRepository.findById(id) or any custom logic
        // For simplicity, I'm assuming a method getConfigurationById is available in the repository
        Configuration configuration = configurationRepository.getConfigurationById(id);
        return configuration.getData();
    }

    public void updateRemark(String id, String remark) {
        // Implement logic to update the remark in MongoDB based on id
        // You can use configurationRepository.findById(id) and then update the remark
        // For simplicity, I'm assuming a method updateRemarkById is available in the repository
        configurationRepository.updateRemarkById(id, remark);
    }
}