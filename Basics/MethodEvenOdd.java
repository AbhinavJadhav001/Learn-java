package Basics;

import java.util.Scanner;
public class MethodEvenOdd {
public static void CheckEvenOdd(int num){
    if(num%2==0){
        System.out.print("the number is even");

    }
    else{
        System.out.print("The number is odd");
    }
}


  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number: ");
       int num = sc.nextInt();
      CheckEvenOdd(num);

      sc.close();
  }

}
