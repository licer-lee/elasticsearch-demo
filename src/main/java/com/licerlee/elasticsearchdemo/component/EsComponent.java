package com.licerlee.elasticsearchdemo.component;

import com.licerlee.elasticsearchdemo.domain.UserEntity;
import org.elasticsearch.index.query.QueryBuilder;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.elasticsearch.index.query.QueryBuilders.matchAllQuery;

@Component
public class EsComponent {
    private final ElasticsearchRestTemplate template;

    public EsComponent(ElasticsearchRestTemplate template) {
        this.template = template;
    }


    public boolean createIndex(String indexName){
        return template.createIndex(indexName);
    }

    public boolean indexExists(String indexName){
        return template.indexExists(indexName);
    }

    public void customerQuery(){

//        SearchQuery searchQuery = new NativeSearchQueryBuilder()
//                .withQuery(matchAllQuery())
//                .withFilter(boolFilter().must(termFilter("name", "liwc")))
//                .build();
//
//        List<UserEntity> users = template.queryForList(searchQuery, UserEntity.class);
    }
}
