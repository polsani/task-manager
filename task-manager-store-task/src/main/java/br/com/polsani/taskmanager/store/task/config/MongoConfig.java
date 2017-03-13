package br.com.polsani.taskmanager.store.task.config;

import com.github.fakemongo.Fongo;
import com.mongodb.MongoClient;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

@Configuration
public class MongoConfig extends AbstractMongoConfiguration {

	@Override
    protected String getDatabaseName() {
        return "tasks";
    }

    @Override
    public MongoClient mongo() {
        return new Fongo("mongo-db").getMongo();
    }
}
