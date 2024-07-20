/* Professor Kishore wanted the kids to learn about Special Numbers.(A two digit number is said to be a special number if the sum of sum of its digitd and the product of its digits is equal to the number itself. For example, 19 is a special number.The dgits in 19 are 1 and 9. The sum of the digits is 10 and the product of the digits is 9,10+9=19). Can you help Kishore to write a program to find all special numbers between 2 limits m and n.*/

import java.util.*;
class for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = m; i<=n; i++){
            int ones = i%10;
            int tenths = i/10;
            int sum = ones+tenths;
            int product = ones*tenths;
            int magic = sum+product;
            if(magic==i){
                System.out.println(i);
            }
            else{
                continue;
            }
            
        }
                
        }
    }
