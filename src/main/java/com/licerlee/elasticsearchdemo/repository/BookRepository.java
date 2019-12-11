package com.licerlee.elasticsearchdemo.repository;

import com.licerlee.elasticsearchdemo.domain.BookEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface BookRepository extends ElasticsearchRepository<BookEntity, String> {

    Page<BookEntity> findByName(String name, Pageable pageable);

}
