package Chapter1;

public class PharseOMatic {
    
    public static void main(String[] args) {
		
		String[] ListOne = {"24/7","multi-Tier","30,000 foot","B-to-B","win-win","front-end",
							"web-based","pervasive","smart","six-sigma","critical-path","dynamic"};
		String[] ListTwo = {"empowered","sticky","value-added","oriented","centric","distributed",
							"clustered","branded","outside-the-box","positioned","networked","focused",
							"leveraged","aligned","targeted","shared","cooperative","accelerated"};
		String[] ListThree = {"process","tipping-point","solution","architecture","core competency","strategy",
							"mindshare","portal","space","vision","paradigm","mission"};

		int ListOneLength = ListOne.length;
		int ListTwoLength = ListTwo.length;
		int ListThreeLength = ListThree.length;

		System.out.println("List One Length " + ListOneLength);
		System.out.println("List Two Length " + ListTwoLength);
		System.out.println("List Three Length " + ListThreeLength);

		int listOneRandomNumber = (int) (Math.random() * ListOneLength);
		int listTwoRandomNumber = (int) (Math.random() * ListTwoLength);
		int listThreeRandomNumber = (int) (Math.random() * ListThreeLength);

		System.out.println("List One Random Number " + listOneRandomNumber);
		System.out.println("List Two Random Number " + listTwoRandomNumber);
		System.out.println("List Three Random Number " + listThreeRandomNumber);

		String phrase = ListOne[listOneRandomNumber] + " " + ListTwo[listTwoRandomNumber] + " " + ListThree[listThreeRandomNumber];

		System.out.println(phrase);
	}
}
