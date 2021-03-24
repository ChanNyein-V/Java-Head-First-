package Chapter1;

public class BeerSong {
    public static void main(String[] args) {

		int bottleCount = 5;
		String label = " bottles";

		System.out.println("Starting Party, number of beers.....");

		while(bottleCount > 1)
		{
			System.out.println(bottleCount + label + " of beer.");
			bottleCount = bottleCount - 1;
		}

		if(bottleCount == 1)
		{
			label = " bottle";
			System.out.println(bottleCount + label + " of beer.");
		}

	}
}
