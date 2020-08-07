package com.nd2k.server_mongo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@Document(collection = "User")
public class User {

    @Id
    private String id;
    private String name;
    private String email;
    private List<Project> listOfProjects;
}
