import java.util.*;

class BankT
{
  int ab,ia,wa,acc_no;
  String name,acc_type;
  void create_acc()
 {
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the customer name");
  name=sc.nextLine();

  System.out.println("enter the account number");
  acc_no=sc.nextInt();

  System.out.println("enter the account type");
  acc_type=sc.nextLine();
  acc_type=sc.nextLine();

  System.out.println("enter the inital amount");
  int ia=sc.nextInt();
  ab=ia;
  System.out.println("Avilable balance in Bank is:"+ab);
 }
  
  void depo_money()
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter customer account number");
   int n=sc.nextInt();
  
   if(acc_no==n)
   {
    System.out.println("avilable balance is:"+ab);
    System.out.println("enter the amount you want to be deposite in your account");
    int depo=sc.nextInt();
    ab=ab+depo;
    System.out.println("Now aviliable balance is:"+ab);
   }
  else
  {
   System.out.println("Account does not exist");
  }
}

 void with_money()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the amount you want to withdrow");
    wa=sc.nextInt();
    if(ab>wa)
    {
      ab=ab-wa;
      System.out.println("Now avilibale balance is:"+ab);
    }
   else
    {
     System.out.println("Not sufficient balance");
   }

  }

 void check_bal()
  {
   System.out.println("Customer name is:"+name);
   System.out.println("Account no is:"+acc_no);
   System.out.println("Account type is:"+acc_type);
   System.out.println("aviliable balance is:"+ab);
  }
 public static void main(String args[])
 {
 BankT b=new BankT();

 while(true)
  {
   System.out.println("!.....Spark Bank.....!");
   System.out.println("1. Create_acc");
   System.out.println("2. Deposite money");
   System.out.println("3. Withdrow money");
   System.out.println("4. Check money");
   System.out.println("5. Exit");
   
   Scanner sc=new Scanner(System.in);
   System.out.println("enter your choice");
   int ch=sc.nextInt();
   switch(ch)
  {
   case 1:b.create_acc();
   break;
   case 2:b.depo_money();
   break;
   case 3:b.with_money();
   break;
   case 4:b.check_bal();
   break;
   case 5:System.exit(0);
   default:
   System.out.println("invalid choice");
  }
 }
 }
}
