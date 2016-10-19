import java.util.*;

class A
{
 void add(int a,int b,int c,int d,int e)
 {
  System.out.println("addition of five number is:"+ (a+b+c+d+e));
 }
void add(float f,float g,float h,float i,float j)
 {
    System.out.println("addition of five number is:"+ (f+g+h+i+j));
 }

}

class MethodOverloading extends A
{
 public static void main(String args[])
 {
  MethodOverloading mo=new MethodOverloading();
  
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the value of a");
 int a=sc.nextInt();
 System.out.println("enter the value of b");
 int b=sc.nextInt();
 System.out.println("enter the value of c");
 int c=sc.nextInt();
 System.out.println("enter the value of d");
 int d=sc.nextInt();
 System.out.println("enter the value of e");
 int e=sc.nextInt();

 System.out.println("enter the value of f");
 float f=sc.nextFloat();
 System.out.println("enter the value of g");
 float g=sc.nextFloat();
 System.out.println("enter the value of h");
 float h=sc.nextFloat();
 System.out.println("enter the value of i");
 float i=sc.nextFloat();
 System.out.println("enter the value of j");
 float j=sc.nextFloat();
 
 
  mo.add(a,b,c,d,e);
  mo.add(f,g,h,i,j);



 }
  
}
