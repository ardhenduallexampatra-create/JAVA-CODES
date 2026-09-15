
import java.util.Scanner;
public class ATM {
  public static int Debit(int b,int a){
    return b-a;}
    public static int Display(int b){
    return b;}
    public static int insert(int b,int a){
    return b+a;}

  public static void main(String[] args) {
        System.out.println("1. Debit");
        System.out.println("2. Display Balance");
        System.out.println("3. Insert/Deposit");
        System.out.println("4. Exit");

   int b=200000;
   int a;
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter your choice: ");
    int ch=sc.nextInt();
   switch (ch) {

    case 1:
         System.out.print("Enter amount to debit: ");
          a=sc.nextInt();
          b=Debit(b,a);
          System.out.println("Amount successfully debited");
          System.out.println("Remaining balance = " + b);
        break;

    case 2:
        b=Display(b);
        System.out.println("Balance = " + b);
        break;

    case 3:
          System.out.print("Enter amount to deposit: ");
        a=sc.nextInt();
        b=insert(b,a);
        System.out.println("New balance = " + b);
        break;
     case 4:
      System.out.println("Exiting...");
    default:
         System.out.println("Invalid choice");
}sc.close();
  }
}
