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
     /**
      * Load the object with date posted, author, and text content.
      */
     public PostedMessage(String posted, String author, String title, String text) {
		super();
		this.posted = posted;
		this.author = author;
		this.title = title;
		this.text = text;
	}
	/**
	 * Returns the date and time at which this message was posted.
	 */
	public String getPosted() {
		return posted;
	}
	/*
	 * Returns the author of this message.
	 */
	public String getAuthor() {
		return author;
	}
	/*
	 * Returns the title of this posting.
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * Returns the content of this posting
	 */
	public String getText() {
		return text;
	}
	String text;
}
