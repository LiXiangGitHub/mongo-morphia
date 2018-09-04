package com.lixiang.mongo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class NativeCRUDtest {
    public static void main(String[] args) {
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
        MongoDatabase mongoDatabase = mongoClient.getDatabase("lixiang-test");
        MongoCollection<Document> mongoCollection=  mongoDatabase.getCollection("t_member");
        Document document = new Document();
        document.append("name","xiangzi");
        document.append("age",18);
        document.append("adrr","shanghai");
        mongoCollection.insertOne(document);
    }
}
