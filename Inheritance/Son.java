import java.util.*;

class GrandFather
{
 String body_color;
 int land;
 String nature;
 String edu;
 String living_place;

 void gf_property()
 {
  Scanner sc=new Scanner(System.in);

 
  System.out.println("enter the land of grand father");
  land=sc.nextInt();

  System.out.println("enter the nature of grand father");
  nature=sc.nextLine();
  nature=sc.nextLine();
 
  System.out.println("enter the body color of grand father");
  body_color=sc.nextLine();
  


 }

}
 class Father extends GrandFather
 {
    void f_property()
    {
     System.out.println("enter the living place");
     Scanner sc=new Scanner(System.in);
     living_place=sc.nextLine();

    }
 }

  class Son extends Father
  {
   void s_property()
   {
    System.out.println("enter the education");
    Scanner sc=new Scanner(System.in);
    edu=sc.nextLine();
   

   }

   void display()
 {
  Scanner sc=new Scanner(System.in);
  
  System.out.println("body color is: "+ body_color);
  System.out.println("Land is: "+ land);
  System.out.println("nature is : "+ nature);
  System.out.println("living place is: "+ living_place);
  System.out.println("education is: "+ edu);

 }

   public static void main(String args[])
   {
     Son s=new Son();
     s.gf_property();
     s.f_property();
     s.s_property();
     s.display();
   }
  }
