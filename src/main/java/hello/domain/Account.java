package hello.domain;

import java.util.Set;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class Account {
	
	@Id
	private String id;
	
	@JsonIgnore
    public String password;
    public String username;
    
	private Set<Bookmark> bookmarks;
}
