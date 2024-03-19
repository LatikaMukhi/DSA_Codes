import java.util.*;
public class fibonacciRecursion{
    public static void main(String args[]){
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number :");
        n=sc.nextInt();
       
        System.out.println(fib(n)); 
    }
    public static int fib(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
}
