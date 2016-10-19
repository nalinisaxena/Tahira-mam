import java.util.*;

class InputSeq
{
public static void main(String args[])
{
int sum=0;
int count=0;

int a[]=new int[5];
System.out.println("enter the array element");
//for(int i=0;i<5;i++)
int i;
 i=0;
while(i<5)
{

Scanner sc=new Scanner(System.in);
a[i]=sc.nextInt();
if(a[i]==0)
{
break;
}i++;
}
System.out.println("display the array element");
//for(i=0;i<5;i++)
while(i<5)
{
if(a[i]!=0)
{
System.out.println(a[i]);
sum=sum+a[i];
count++;

}
i++;
}

System.out.println("sum is="+sum);
System.out.println("avg is="+sum/count);
}
}


