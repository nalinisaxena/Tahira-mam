//1. Copy constructor
//Implement a program to copy the values of one object into another object using demo class with the help of copy constructor.

class Demo
{
 int id;
 String name;

 Demo()
 {
  id=10;
  name="nalini";
 }
 
 Demo(int idd,String named)
 {
  id=idd;
  name=named;
 }
  
 Demo(Demo c)
 {
  id=c.id;
  name=c.name;
 }
  void display()
  {
   System.out.println("id is:"+id+"name is:"+name);
  }
 
 public static void main(String args[])
 {
  Demo d=new Demo(10,"neha");
  Demo d1=new Demo(d);
  
  d.display();
  d1.display();

 }
}

