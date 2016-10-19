import java.util.*;
import java.lang.*;

class Forth
{
 void factorial()
{
System.out.println("enter the number");
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int f=1;
 for(int i=1;i<=n;i++)
 {
  f=f*i;
  }
  System.out.println("Factorial of: "+f);
}

  void fibonacci()
  {
   int first=0,second=1,next;
   System.out.println("enter the number");
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   
   for(int c=0;c<n;c++)
   {
    if(c<=1)
    {
     next=c;
    }
    else
    {
     next=first+second;
     first=second;
     second=next;
    }
     System.out.println("fibbonacci series is:"+next);
   }
 }
void sum()
  {
   int sum=0;
  System.out.println("enter the number");
 Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<=n;i++)
    {
     sum=sum+i;
      
     }
     System.out.println("sum is:"+sum);
   }
 public static void main(String args[])
 {
  while(true)
   {
   System.out.println("!....Menu Driven Program.....!");
   System.out.println("1.Factorial");
   System.out.println("2.Fibonacci series");
   System.out.println("3.Sum of digits");
   
   Forth fr=new Forth();
   System.out.println("enter the choice");
   Scanner sc=new Scanner(System.in);
   int ch=sc.nextInt();
   switch(ch)
   {
    case 1: fr.factorial();
    break;
    case 2: fr.fibonacci();
    break;
    case 3: fr.sum();
    break;
    default: System.out.println("invalid choice");
    }
 
}
 
}
}
