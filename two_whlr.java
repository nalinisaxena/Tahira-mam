

//Simple Inheritance
//Write a vehicle and two_whlr class by using proper variables and methods for it.


import java.util.*;

class Vehical
{
 void whlr_design()
 {
  int whlr;
  String color;

  Scanner sc=new Scanner(System.in);

  System.out.println("enter the wheelar type");
  whlr=sc.nextInt();
  

  System.out.println("enter the color");
  color=sc.nextLine();
  color=sc.nextLine();

  System.out.println("wheelar type is:"+whlr+"\n"+"color is :"+color);
 }

}

class two_whlr extends Vehical
{
 void avg_cal()
 {
  float avg;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the distance");
  int dis=sc.nextInt();

  System.out.println("enter the time");
  float time=sc.nextFloat();
  
  System.out.println("avg speed of wheelar is: "+(dis/time));

 }
 public static void main(String args[])
 {
  two_whlr tw=new two_whlr();
   
  tw.whlr_design();
  tw.avg_cal();

 }
}
