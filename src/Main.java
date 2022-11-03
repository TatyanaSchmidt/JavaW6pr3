import java.util.Scanner;

public class Main {
    public static int calculateFactorial(int numFactorial) {
        int result = 1;
        for (int i = 1; i <= numFactorial; i++) {
            result = i * result;
        }
        return result;
    }
        public static void main (String[]args){
            System.out.println("Введите число для расчета факториала");
            Scanner inputNum = new Scanner(System.in);
            int numFactorial = inputNum.nextInt();
            System.out.println(calculateFactorial(numFactorial));
        }
    }
