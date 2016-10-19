import java.util.*;

class Grading_System
{
public static void main(String args[])
{

Scanner sc= new Scanner(System.in);

System.out.println("Enter the marks of Ist Maths");
int maths=sc.nextInt();

System.out.println("Enter the marks of Ist English");
int eng =sc.nextInt();

System.out.println("Enter the marks of Ist Scinece");
int sci=sc.nextInt();

System.out.println("Enter the marks of Ist Hindi");
int hindi=sc.nextInt();

float sum=maths+eng+sci+hindi;

float avg=sum/4;
float per=(sum/400)*100;
System.out.println("avg is="+avg);
System.out.println("per is="+per+"%");

if(per>70)
{
System.out.println("Grade is A+");
}
else if(per>60 && per<70)
{
System.out.println("Grade is A");
}
else if(per>50 &&  per<60)
{
System.out.println("Grade is B");
}
else if(per>40 && per<50)
{
System.out.println("Grade is C");
}
else
{
System.out.println("Fail");
}
}
}

