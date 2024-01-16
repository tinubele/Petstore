package com.itv.project.entites;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "configurations")
public class Configuration {

    @Id
    private String id;

    private List<List<String>> data;
    private String remark;
    public List<List<String>> getData() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getData'");
    }

    // Getters and setters
}