package hello;

import java.util.Arrays;
import java.util.Set;
import java.util.function.Consumer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.google.common.collect.Sets;

import hello.domain.Account;
import hello.domain.Bookmark;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
    
	/*@Bean
	CommandLineRunner init(final AccountRepository bookmarkRepository) {
		log.info("Initializing bookmark app");
		return new CommandLineRunner() {
			public void run(String... evt) throws Exception {
				Arrays.asList("jhoeller,dsyer,pwebb,ogierke,rwinch,mfisher,mpollack,jlong".split(","))
						.forEach(new Consumer<String>() {
							public void accept(String a) {
								Set<Bookmark> bookmarks = Sets.newHashSet(
										Bookmark.builder().description("Description 1").uri("http://bookmark.com/1/").build(),
										Bookmark.builder().description("Description 2").uri("http://bookmark.com/2/").build());

								Account account = new Account();
								account.setUsername(a);
								account.setPassword("password");
								account.setBookmarks(bookmarks);

								account = bookmarkRepository.save(account);
							}
						});
			}
		};
	}*/

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}
