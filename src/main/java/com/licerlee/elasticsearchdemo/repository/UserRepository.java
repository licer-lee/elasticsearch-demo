package com.licerlee.elasticsearchdemo.repository;

import com.licerlee.elasticsearchdemo.domain.UserEntity;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface UserRepository extends Repository<UserEntity, String> {

    List<UserEntity> findByNameAndAge(String name, Integer age);

}
