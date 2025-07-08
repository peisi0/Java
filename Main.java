import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int sum = 0;
        Scanner input = new Scanner(System.in);
        for(int i=0;i<=4;i++){
            System.out.print("请输第" + (i+1) + "个学生的成绩: ");
            numbers[i]= input.nextInt();
            sum += numbers[i];
        }

        int average = sum / 5;
        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();
        System.out.print("Average: " + average + "\n");
        System.out.print("Maximum: " + max + "\n");
        System.out.println("Minimum: " + min);
    }
}
