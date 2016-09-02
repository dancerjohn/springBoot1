package hello.greeting;

import lombok.Builder;
import lombok.Data;

@Data
public class Greeting {
	private final long id;
    private final String content;

    @Builder
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
}
