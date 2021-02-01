//Write a program to check if a given number is prime or not

import java.util.Scanner;

public class Primeno {

	public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number to check whether the number is prime or not");

     int n=sc.nextInt();
     int c=0;
for(int i=1;i<=n;i++)
  {
     if(n%i==0){
     c++;
     }
}
     if(c==2){
  System.out.println("Prime number");
}
    else
{
  System.out.println("Not a prime number");
}
}
}

