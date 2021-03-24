package mixedMessage.Chapter5;

public class MixFor5 {
    public static void main(String[] args) {
        int x = 0;
        int y = 30;

        for (int outer = 0; outer < 3; outer++) {
            
            for (int inner = 4; inner > 1; inner--) {
                x = x + 2; // x = 2,5,7,10,12,15,17,20,22,25,27,30,32,35,37,40..
                y = y - 2; //y = 28,26,24,22,20,18,16,14,12,10,8,6

                if (x == 6) {
                    break;
                }
                x = x + 3;
            }
            y = y - 2;
        }
        System.out.println(x + " " + y);
    }

    /* 
    x = x + 3; // 54 6 
    x = x + 6; // 60 10
    x = x + 2; // 45 6*/
}
