package hello.context;

import java.net.UnknownHostException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class SpringContext {

	public SpringContext(){
		log.info("Initializing spring context");
	}
	
	@Bean
	public MongoOperations mongoOperations() throws UnknownHostException{
		Mongo mongo = new MongoClient("localhost:27017");
		return new MongoTemplate(mongo, "bookmarks");
	}
	
//	@Bean
//	public MongoInitializer mongoIniter(){
//		return new MongoInitializer();
//	}
}
