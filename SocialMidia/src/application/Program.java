package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import entities.Coment;
import entities.Post;

public class Program {

	public static void main(String Args[]) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Post post = new Post(
				sdf.parse("21/06/2018 20:30:56"), 
				"Travelling to New Zealand !!",
				"I'm going to visit this nice country",
				12);
		
		Coment c1 = new Coment("whow that nice !!");
		Coment c2 = new Coment("whow awesome");
		
		post.addComent(c1);
		post.addComent(c2);
		
		System.out.println(post);

		
	
		
	}
}
