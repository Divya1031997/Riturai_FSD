/* Program for finding Minimum and maximum number without using < or> symbol*/
/* Date-06/1/2020
   Name - Ritu Bala Rai*/

public class Minmax {
            public static void main(String[] args) {
            int f1 = -9, f2 = -10;
            int max = ((f1+f2) + Math.abs(f1-f2))/2;
            System.out.println("Biggest Number is "+max);
            int min = ((f1+f2) - Math.abs(f1-f2))/2;
            System.out.println("Smallest number is "+min);
             }
          }
