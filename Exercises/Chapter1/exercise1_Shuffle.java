package Exercises.Chapter1;

public class exercise1_Shuffle {
    //Output is a-b c-d
	public static void main(String[] args) {

		int x = 3;

		while(x > 0) {

			if(x > 2) {
				System.out.print("a");
			}

			x = x - 1;
			System.out.print("-");

			if(x == 2) {
				System.out.print("b c");
			}

			if(x == 1) {
				System.out.print("d");
				x = x - 1;
			}
		}
	}
}
