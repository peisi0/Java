import java.util.ArrayList;
import java.util.Scanner;


public class Practice2 {
    public static void main(String[] args) {
        System.out.println("-------------------------------");
        Scanner input = new Scanner(System.in);
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Text");
        myList.add("123");
        System.out.print("Please Enter the first number: ");
        String in1 = input.nextLine();
        myList.add(in1);
        int tin1 = Integer.parseInt(in1);
        //System.out.print("\n");
        System.out.print("Please enter the next number: ");
        String in2 = input.nextLine();
        myList.add(in2);
        int tin2 = Integer.parseInt(in2);
        System.out.println("The sum is " + (tin1 + tin2));
        System.out.println(myList);
    } 
    
}
