import java.util.*;

class Employe
{
 Employe()
 {
  emp_id=100;
  emp_name="nalini";
  emp_desig="android devleoper";
  
 }
 int emp_id;
 String emp_name;
 String emp_desig;
 double sal,hra,bs,da,ta;

 void emp_getdata()
  {
 
 Scanner sc=new Scanner(System.in);

 System.out.println("enter the employe id");
 emp_id=sc.nextInt();

 System.out.println("enter the employe name");
 emp_name=sc.nextLine();
 emp_name=sc.nextLine();

 System.out.println("enter the employe designation");
 emp_desig=sc.nextLine();
  }

 void emp_setdata()
  {
    System.out.println("employe id is:"+emp_id);
    System.out.println("employe name is:"+emp_name);
    System.out.println("employe designation is:"+emp_desig); 
  }

 void emp_calsal()
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the basic salary");
   bs=sc.nextDouble();
    hra=(0.20*bs);
    da=(0.12*bs);
    ta=(0.10*bs);
   sal=bs+hra+ta+da;
   System.out.println("Employe salary is:"+sal);
  }
  public static void main(String args[])
 {
  Employe emp=new Employe();

  emp.emp_getdata();
  emp.emp_setdata();
 emp.emp_calsal();
 }

}

 
