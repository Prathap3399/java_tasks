import java.util.Scanner;

public class GCD {
    static int gcd(int a, int b){
        if (b==0){
            return a;           
        }else{
            return gcd(b,a%b);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
           int a = sc.nextInt();
           int b = sc.nextInt();

        System.out.println("GCD is : "+gcd(a, b));
        sc.close();
    }
}

// Steps:
//  Recursive : the function calls until become 0.
//  Base Condition when b==0;
//  Time complexity: O(log(min(a, b)))
