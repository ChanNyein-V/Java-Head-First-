package Chapter4.GoodDog;

public class GoodDogTestDrive {
    public static void main(String[] args) {
        goodDog one = new goodDog();
        one.setSize(70);

        goodDog two = new goodDog();
        two.setSize(8);

        System.out.println("Dog one : " + one.getSize());
        System.out.println("Dog two : " + two.getSize());

        one.bark();
        two.bark();
    }
}
