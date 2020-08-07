package com.nd2k.server_mongo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@Document(collection = "Projects")
public class Project {

    @Id
    private String id;
    private String projectId;
    private String projectName;
    @DBRef
    private List<User> listOfUsers;
    private List<Tasks> listOfTasks;
}
