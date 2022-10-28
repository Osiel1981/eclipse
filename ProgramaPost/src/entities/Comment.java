package entities;

import java.util.ArrayList;
import java.util.List;

public class Comment {
	private String text;
	public List<Comment> comments = new ArrayList<>();

	public Comment() {
	}

	public Comment(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void addComment(Comment c1) {		
	}
	
	
	
	
}
