package com.nd2k.server_mongo.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Tasks {

    private String taskId;
    private String taskDescription;
    private String priority;
}
