package com.lixiang.mongo;
import com.mongodb.*;
public class MongoCRUDTest {
    public static void main(String[] args) {
        //创建Mongo数据源连接
        Mongo mongo = new Mongo("127.0.0.1",27017);
        //创建mongo数据库
        DB db = new DB(mongo,"mongo_test");
        //获取集合(不存在自动创建)
        DBCollection  dbcollection= db.getCollection("person");
        //插入文档
        DBObject dbObject = new BasicDBObject();
        dbObject.put("name","lixiang");
        dbObject.put("age",19);
        dbcollection.insert(dbObject);
        //查询文档
        DBCursor dbCursor= dbcollection.find();
        for (DBObject obj:dbCursor){
            System.out.printf(obj.toString());
        }
    }
}
