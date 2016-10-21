
//5. Final keyword
//Write a class to demonstrate a use of final keyword.


final class Final//cannot inherit from final Final
{
  final int a=10;
 
final void display()
 {
  a=100;//final variable can not be reassign
  System.out.println("value of a is"+a);
 }
}

class Final_demo extends Final
 {
  void display()//final method can not be overridden
  {
   System.out.println("hiii");
  }
 public static void main(String args[])
 {
  Final_demo fd=new Final_demo();
  fd.display();
 }
}
