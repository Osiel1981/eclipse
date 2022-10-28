package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class program {

	public static void main(String[] args) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Comment c1 = new Comment("HAVE A NICE TRIP!");
		Comment c2 = new Comment("Wow that's awesome");
		Post p1 = new Post(
				sdf.parse("21/06/2018 13:05:44"), 
				"Traveling to New Zealand",
				"I'm going to visit this wonderful country!",
				12);
		c1.addComment(c1);
		c2.addComment(c2);
		
		
	}

}
