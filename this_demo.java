
//3. This keyword
//Write a class to demonstrate a use of this keyword.


class this_demo
{
 int id;
 String name;

 this_demo()
 {
  id=10;
  name="nalini";
 }
 this_demo(int id,String name)
 {
  this.id=id;
  this.name=name;
 }
  void display()
  {
   System.out.println("id is: "+id+"name is: "+name);
  }
  
 public static void main(String args[])
 {
   this_demo td=new this_demo();
   this_demo td1=new this_demo(20,"neha");
   td.display();
   td1.display();
 }
}
