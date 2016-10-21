//5. Constructor overloading
//Implement a StudentInfo class having the data members as Stud_Id,Stud_Name,andStud_Age and the methods are getdata() and setdata() by using constructor overloading.




import java.util.*;


class StudentInfo
{
 int stud_id;
 String stud_name;
 int stud_age;

 StudentInfo()
 {
  stud_id=10;
  stud_name="maya";
  stud_age=25;
 }
 
 StudentInfo(int id,String name,int age )
 {
  stud_id=id;
  stud_name=name;
  stud_age=age;
 }
 void getdata()
 {
  Scanner sc=new Scanner(System.in);
 
  System.out.println("enter the student id");
  stud_id=sc.nextInt();

  System.out.println("enter the student name");
  stud_name=sc.nextLine();
  stud_name=sc.nextLine();

  System.out.println("enter the student age");
  stud_age=sc.nextInt();

 }

 void setdata()
 {
  
 System.out.println("student id is:"+stud_id);
 System.out.println("student name is:"+stud_name);
 System.out.println("student age is:"+stud_age);

 }
 public static void main(String args[])
 {
  StudentInfo si=new StudentInfo();
  StudentInfo si1=new StudentInfo(20,"abs",200);
  //si.getdata();
  si.setdata();
 }
}
