package com.itv.project.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itv.project.services.ConfigurationService;

@RestController
@RequestMapping("/api/configurations")
public class ConfigurationController {

    @Autowired
    private ConfigurationService configurationService;

    @GetMapping("/{id}")
    public ResponseEntity<List<List<String>>> getConfigurations(@PathVariable String id) {
        List<List<String>> configurations = configurationService.getConfigurations(id);
        return ResponseEntity.ok(configurations);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, String>> updateRemark(@PathVariable String id, @RequestBody Map<String, String> remarkMap) {
        String remark = remarkMap.get("remark");
        configurationService.updateRemark(id, remark);
        Map<String, String> response = new HashMap<>();
        response.put("message", "success");
        return ResponseEntity.ok(response);
    }
}