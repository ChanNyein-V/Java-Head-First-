package Chapter2.Movie;

public class MovieTestDrive {
    public static void main(String[] args) {
		
		Movie one = new Movie();
		one.title = "Gone with the Stock";
		one.genre = "Tragic";
		one.rating = -2;
		one.playIt();

		Movie two = new Movie();
		two.title = "Lion King";
		two.genre = "Drama,Action";
		two.rating = 5;
		two.playIt();

		Movie three = new Movie();
		three.title = "Naruto";
		three.genre = "Anime";
		three.rating = 10;
		three.playIt();
	}
}
