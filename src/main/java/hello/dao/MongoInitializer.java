package hello.dao;

import java.util.Arrays;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.common.collect.Sets;

import hello.domain.Account;
import hello.domain.Bookmark;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MongoInitializer {

	@Autowired
	public AccountRepository accountRepo;

	public MongoInitializer() {
		log.info("Created initializer");
	}

	@PostConstruct
	public void init() {

	for (String s : 	Arrays.asList("jhoeller,dsyer,pwebb,ogierke,rwinch,mfisher,mpollack,jlong".split(","))){
		Set<Bookmark> bookmarks = Sets.newHashSet(
				Bookmark.builder().description("Description 1").uri("http://bookmark.com/1/").build(),
				Bookmark.builder().description("Description 2").uri("http://bookmark.com/2/").build());

		Account account = new Account();
		account.setUsername(s);
		account.setPassword("password");
		account.setBookmarks(bookmarks);

		account = accountRepo.save(account);
	}
		log.info("Ran initializer");
	}
}
