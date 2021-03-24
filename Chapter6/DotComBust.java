package Chapter6;

import java.util.ArrayList;

public class DotComBust {

    //1.declare and initialize the variables we'll need
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void finishGame() {
        //18.print a message telling the user how he did in the game
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");

        if (numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + "guesses.");
            System.out.println(" You got out before your options sank.");
        }
        else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options.");
        }
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;//11.increment the number of guesses the user has made
        String result = "miss";//12.assume it's a 'miss', unless told otherwise

        for (DotCom dotComToTest : dotComsList) {//13.repeat with all DotComs in the list
            result = dotComToTest.checkYourself(userGuess);//14.ask the DotCom to check the user guess,
            //looking for a hit (or kill)

            if (result.equals("hit")) {
                break;//15.get out of the loop early, no point in testing the others
            }

            if (result.equals("kill")) {
                dotComsList.remove(dotComToTest);
                break;//16.this guy's dead, so take him out of the DotComs list then get out of the loop
            }
        }
        System.out.println(result);//17.print the result for the user
    }

    private void startPlaying() {
        while (!dotComsList.isEmpty()) {//7.as long as the DotCom list is NOT empty
            //(the '!' means NOT the same as (dotComList.isEmpty() == false) )
            String userGuess = helper.getUserInput("Enter a guess.");//8.get user input
            checkUserGuess(userGuess);//9.call our own checkUserGuess method
        }
        finishGame();//10.call our own finishGame method
    }

    public void setUpGame() {

        //2.make three DotCom objects, give'em names 
        //and stick'em in the ArrayList
        DotCom dotComOne = new DotCom();
        DotCom dotComTwo = new DotCom();
        DotCom dotComThree = new DotCom();

        dotComOne.setName("MyShitFantacy.com");
        dotComTwo.setName("MyBitch.com");
        dotComThree.setName("MyEx.com");

        dotComsList.add(dotComOne);
        dotComsList.add(dotComTwo);
        dotComsList.add(dotComThree);

        //3.print brief instructions for user
        System.out.println("Your goal is to sink three dot coms.");
        System.out.println(dotComOne.getName() + "," + 
        dotComTwo.getName() + "," +
        dotComThree.getName());
        System.out.println("Try to sink them all in the fewest number of guesses.");

        for (DotCom dotComToSet : dotComsList) { //4.repeat with each DotCom in the list
            ArrayList<String> newLocation = helper.placeDotCom(3);//5.ask the helper for a DotCom location
            //(an ArrayList of Strings)
            dotComToSet.setLocationCells(newLocation);//6.call the setter method on this DotCom to
            //give it the location you just got from the helper
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();//19.create the game object
        game.setUpGame();//20.tell the game object to set up the game
        game.startPlaying();//21.tell the game object to start the main game play loop
        //(keep asking for user input and checking the guess)
    }
}
