package Chapter2.Movie;

public class Movie {
    String title;
	String genre;
	int rating;

	void playIt() {
		System.out.println("Movie Title : " + title);
		System.out.println("Movie Genre : " + genre);
		System.out.println("Movie Rating : " + rating);
		System.out.println("Playing the movie");
	}
}
