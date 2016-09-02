package hello.context;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

import lombok.extern.slf4j.Slf4j;

@Configuration
@EnableMongoRepositories(basePackages={"hello.dao"})
@Slf4j
public class MongoContext extends AbstractMongoConfiguration {

	public MongoContext(){
		log.info("Initializing mongo context");
	}
	
  @Override
  protected String getDatabaseName() {
    return "bookmarks";
  }

  @Override
  public Mongo mongo() throws Exception {
    return new MongoClient();
  }

  @Override
  protected String getMappingBasePackage() {
    return "com.example.dao";
  }
}