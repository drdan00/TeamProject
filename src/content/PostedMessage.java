package content;
/**
 * Represents a message posted to the content management system.
 * @author drdan
 *
 */
public class PostedMessage {
     String posted;
     String author;
     String title;
     public PostedMessage(String posted, String author, String title, String text) {
		super();
		this.posted = posted;
		this.author = author;
		this.title = title;
		this.text = text;
	}
	public String getPosted() {
		return posted;
	}
	public String getAuthor() {
		return author;
	}
	public String getTitle() {
		return title;
	}
	public String getText() {
		return text;
	}
	String text;
}
