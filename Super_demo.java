//4. Super keyword
//Write a class to demonstrate a use of Super keyword.


class Super
{
 int speed=50;
 Super()
 {
  System.out.println("Base class");
 }
  void display()
  {
   System.out.println("hello");
  }

}

class Super_demo extends Super
{
  int speed=100;
  
   Super_demo()
   {
    System.out.println("derived class");
   }

  void display()
 {
  super.display();
  System.out.println(super.speed);
  System.out.println(speed);
 }

 public static void main(String args[])
 {
  Super_demo sd=new Super_demo();
  sd.display();
 }
}
