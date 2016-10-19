import java.util.*;

class car
{
  float speed;

 void cal_speed()
 {
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the distance");
  float dis=sc.nextFloat();

  System.out.println("enter the time");
  float time=sc.nextFloat();

  speed=dis/time;
  
  System.out.println("speed of the car is:"+speed);
 }


}

 class swift extends car
 {
  
  void cal_speed()
  {
   super.cal_speed();
   
  }
  public static void main(String args[])
  {

   swift s=new swift();
   s.cal_speed();

  }
 }
