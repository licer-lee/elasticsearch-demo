package com.licerlee.elasticsearchdemo.component;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Random;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EsComponentTest {

    @Autowired
    EsComponent esComponent;

    @Test
    public void testEsConn(){
        System.out.println("esComponent.toString() = " + esComponent.toString());
        String uuid = UUID.randomUUID().toString();
        boolean index = esComponent.createIndex("my-index"+ uuid);
        Assert.assertTrue(index);

        System.out.println("esComponent.indexExists(\"my-index\") = " + esComponent.indexExists("my-index"+uuid));
    }
}