package mixedPuzzle.Chapter1;

public class PuzzleExer1 {
    public void Candidates_1() {

		int x = 0;
		int y = 0;

		while(x < 5) {
			y = x - y;

			System.out.print(x + "" + y + " ");
			x = x + 1;
		}
		System.out.print("\n");

		/*
			x = 0,1,2,3,4
			y = 0,1,1,1,2

			y = x - y
			y = 0,1,1,2,2

			s.o.pln 00,11,21,32,42

			x = 1,2,3,4,5
		*/
	}

	public void Candidates_2() {

		int x = 0;
		int y = 0;

		while(x < 5) {
			y = y + x;

			System.out.print(x + "" + y + " ");
			x = x + 1;
		}
		System.out.print("\n");

		/*
			x = 0,1,2,3,4
			y = 0,0,1,3,6

			y = y + x
			y = 0,1,3,6,10

			s.o.pln -> 00,11,23,36,410

			x = 1,2,3,4,5
		*/
	}

	public void Candidates_3() {

		int x = 0;
		int y = 0;

		while(x < 5) {
			
			y = y + 2;
			if(y > 4) {
				y = y - 1;
			}

			System.out.print(x + "" + y + " ");
			x = x + 1;
		}
		System.out.print("\n");

		/*
			x = 0,1,2,3,4
			y = 0,2,4,5,6

			y = y + 2
			y = 2,4,6,7,8

			(y > 4) y = y - 1
			y = 5,6,7

			s.o.pln -> 02,14,25,36,47
			x = 1,2,3,4,5
		*/
	}

	public void Candidates_4() {

		int x = 0;
		int y = 0;

		while(x < 5) {
			x = x + 1;
			y = y + x;

			System.out.print(x + "" + y + " ");
			x = x + 1;
		}
		System.out.print("\n");

		/*
			x = 0,2,4
			y = 0,1,4

			x = x + 1 => x = 1,3,5
			y = y + x => y = 1,4,9

			s.o.pln -> 11,34,59
			x = 2,4,6
		*/
	}

	public void Candidates_5() {

		int x = 0;
		int y = 0;

		while(x < 5) {

			if(y < 5) {
				x = x + 1;

				if(y < 3) {
					x = x - 1;
				}
			}
			y = y + 2;

			System.out.print(x + "" + y + " ");
			x = x + 1;
		}
		System.out.print("\n");

		/*
			x = 0,1,2,4
			y = 0,2,4,6

			(y < 5) x = x + 1 => x = 1,2,3,false
			(y < 3) x = x - 1 => x = 0,1,false

			y = y + 2 => y = 2,4,6,8

			s.o.pln => 02,14,36,48
			x = 1,2,4,5
		*/
	}

	public static void main(String[] args) {

		PuzzleExer1 candidatesCalls = new PuzzleExer1();
		candidatesCalls.Candidates_1();
		candidatesCalls.Candidates_2();
		candidatesCalls.Candidates_3();
		candidatesCalls.Candidates_4();
		candidatesCalls.Candidates_5();
	}
}
