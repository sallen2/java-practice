package app;

public class App {
    public static void main(String[] args) {
        // java varables
        int var = 1;
        long var2 = 1000;
        byte var3 = -10;
        float var4 = 1.2f;
        double var5 = 57.1237d;
        char var6 = 'c';
        String var7 = "hello world";

        // println method
        System.out.println("Hello Java");

        // Array
        int[] arr = {1,2,3,4,5,6,7};

        // foreach
        for (int num : arr) {
            int newNum = calScore(num, 25);
            System.out.println("This is num " + num + " times 17: " + newNum);
        }
    }
    
    // Static method
    public static int calScore(int num, int times){
        return(num * times);
    }
}