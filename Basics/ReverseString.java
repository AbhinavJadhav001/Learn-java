package Basics;


public class ReverseString {
 public static void main(String[] args){
      String string="java";
      String revstring ="";
     for(int i = string.length()-1 ; i >=0; i--){
         revstring+=string.charAt(i);


     }
   System.out.println("Original string is: "+string);
     System.out.println("reversed string is: "+revstring);



 }

}
