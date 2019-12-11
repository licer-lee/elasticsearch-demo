package com.licerlee.elasticsearchdemo.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "test", type = "book")
public class BookEntity {
    @Id
    private String id;
    private String name;
    private Integer price;
}
