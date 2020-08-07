package com.nd2k.server_mongo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@AllArgsConstructor
public class Project {

    @Id
    private String id;
    private String projectId;
    private String projectName;
    private List<Tasks> listOfTasks;
}
