/* Get an integer input from user and check if the number is a strong number. A strong number is a number whose factorial of each digit when added gives the same number.*/

import java.util.*;
class strong_number {
    static int Factorial(int a){
        int fact = 1;
        for(int i =1;i<=a;i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int m = sc.nextInt();
        int a = m%100;
        int ones = a%10;
        int tenths = a/10;
        int hundredths = m/100;
        if (Factorial(hundredths)+Factorial(tenths)+Factorial(ones)==m){
            System.out.println(m+"is a strong number.");
        }
       
                
        }
    }
