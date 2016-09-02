package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
    
/*	@Bean
	CommandLineRunner init(AccountRepository bookmarkRepository) {
		log.info("Initializing bookmark app");
		return (evt) -> Arrays.asList("jhoeller,dsyer,pwebb,ogierke,rwinch,mfisher,mpollack,jlong".split(","))
				.forEach(a -> {
					Set<Bookmark> bookmarks = Sets.newHashSet(
							Bookmark.builder().description("Description 1").uri("http://bookmark.com/1/").build(),
							Bookmark.builder().description("Description 2").uri("http://bookmark.com/2/").build());

					Account account = new Account();
					account.setUsername(a);
					account.setPassword("password");
					account.setBookmarks(bookmarks);

					account = bookmarkRepository.save(account);
				});
	}*/

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}
