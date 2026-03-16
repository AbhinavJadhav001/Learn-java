package Basics;
import java.util.Scanner;
public class CalculateDiscount {
    public static void main(String[] args){
            Scanner sc= new Scanner(System.in);

              System.out.print("Enter original price: ");
              Double price = sc.nextDouble();

              System.out.print("Enter product discount amount : ");
              Double Discount = sc.nextDouble();

               Double discpercent = (Discount/price)*100;
               System.out.println("The Discount is: "+Discount);
               System.out.println("Which is Roughly "+discpercent  + "%");

        sc.close();
    }
}
