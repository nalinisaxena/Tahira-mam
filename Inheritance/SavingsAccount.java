import java.util.*;


class BankAccount
{
 int ia,ab,de,wa,intr,total,pri,yr,amt,rat,si;

 void deposit()
 {
  Scanner sc=new Scanner(System.in);
  
  System.out.println("enter the Initial balance");
  ia=sc.nextInt();

  ab=ia;

  System.out.println("now aviliable balance is:"+ab);

  System.out.println("enter the amount you want to be deposite");
  int de=sc.nextInt();
   
  ab=ab+de;

  System.out.println("now aviliable balance is:"+ab);

 }

 void withdrow()
 {
  Scanner sc=new Scanner(System.in);
 
  System.out.println("enter the amount you want to be withdrow");
  wa=sc.nextInt();

  if(ab>wa)
  {
   ab=ab-wa;
   System.out.println("avilibal balnace is: "+ab);
  }
  else 
  {
   System.out.println("not sufficeint balance");
  }
 }
 void getbalance()
 {
  System.out.println("Balance on your account is: "+ab);
 }
}

class CheckingAccount extends BankAccount
{
  void dedectFees()
  {
   System.out.println("deduct fees for jwellary");
  }

}
class SavingsAccount extends BankAccount
{
 void addInterest()
 {
  Scanner sc=new Scanner(System.in);
  
  System.out.println("enter the principal");
  pri=sc.nextInt();

  System.out.println("enter the rate percent");
  rat=sc.nextInt();

  System.out.println("enter the time in year");
  yr=sc.nextInt();

  si=pri*rat*yr/100;

  System.out.println("interest is: " + si);

  total=si+pri;

  System.out.println("total amount with intrest:"+total);
 }


 public static void main(String args[])
 {

  SavingsAccount sa=new SavingsAccount();

  sa.deposit();
  sa.withdrow();
  sa.getbalance();
 
  CheckingAccount ca=new CheckingAccount(); 

  ca.dedectFees();
  sa.addInterest();
 }

}


