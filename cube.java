
import java.util.*;

class cube
{
 int i,cubeo;
 cube(int ic)
 {
  i=ic;
 }

 void display()
 {
  cubeo=i*i*i;
  System.out.println("cube is:"+cubeo);
 }

 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the value of a");
  int a=sc.nextInt();
  cube c=new cube(a);
  c.display();

 }
}
