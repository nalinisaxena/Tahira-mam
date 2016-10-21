//2. Static variable and static method
//Write a class Stat_demo to illustrate a use of static variable and static method.


class state_demo
{
 static int a=10;
static void display()
 {
  System.out.println(a);
 }
 public static void main(String args[])
 {
  state_demo sd=new state_demo();
  System.out.println(a);
  sd.display();
 }
}
