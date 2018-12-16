package app;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        int score = calScore(26,4);
        System.out.println(score);
    }

    public static int calScore(int num1, int num2){
        return(num1 + num2);
    }
}