package beTheCompiler.Chapter1;

public class Exercise1b {
    public void MethodA() {
		System.out.println("Starting of Method A.....");
		int x = 1;

		while(x < 10) {
			System.out.println("x is now " + x);
			x = x + 1;

			if(x > 3) {
				System.out.println("big x");
			}
		}

		System.out.println("Ending of Method A.....\n");
	}

	public void MethodB() {
		System.out.println("Starting of Method B.....");
		int x = 5;

		while(x > 1) {
			System.out.println("x is now " + x);
			x = x - 1;

			if(x < 3) {
				System.out.println("small x");
			}
		}

		System.out.println("Ending of Method B.....\n");
	}


	public void MethodC() {
		System.out.println("Starting of Method C.....");
		int x = 5;

		while(x > 1) {
			System.out.println("x is now " + x);
			x = x - 1;

			if(x < 3) {
				System.out.println("small x");
			}
		}

		System.out.println("Ending of Method C.....");
	}

	public static void main(String[] args) {
		
		Exercise1b methodCalls = new Exercise1b();

		methodCalls.MethodA();
		methodCalls.MethodB();
		methodCalls.MethodC();
	}
}
