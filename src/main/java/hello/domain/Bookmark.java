package hello.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Bookmark {
	public String uri;
	public String description;
	
	public Bookmark(){}

	public Bookmark(String url, String description) {
		super();
		this.uri = url;
		this.description = description;
	};
	
	
}
