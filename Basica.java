import java.util.*;
class Basica
{
public static void main(String args[])
{
String bas="BASIC";

for(int i=0;i<=bas.length()-1;i++)
{
for(int j=0;j<=i;j++)
{
char c=bas.charAt(j);
System.out.print(c);
}
System.out.print("\n");
}
}
}