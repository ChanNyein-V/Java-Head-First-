package beTheCompiler.Chapter3.B;

public class Hobbits {
    String name;
    public static void main(String[] args) {
        
        Hobbits[] h = new Hobbits[3];
        // h[0] = new Hobbits();
        // h[1] = new Hobbits();
        // h[2] = new Hobbits();

        int z = 0;

        //the loop timer should be less than 3
        while (z < 3) {
            
            h[z] = new Hobbits();
            h[z].name = "bilbo";

            if (z == 1) {
                h[z].name = "frodo";
            }

            if (z == 2) {
                h[z].name = "sam";
            }

            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name");
            //this condition is should put here.
            z = z + 1;
        }
    }
}
