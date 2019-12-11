package com.licerlee.elasticsearchdemo.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "demo", type = "user")
public class UserEntity {

    @Id
    private String id;
    private String name;
    private Integer age;

}
