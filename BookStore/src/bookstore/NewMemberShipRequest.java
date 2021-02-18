
package bookstore;

import java.util.Scanner;
public class NewMemberShipRequest {
    String name, Uniname;
    String NID;
    Scanner input = new Scanner(System.in);
    public  void Info()
    {
        
        System.out.print("Enter your Name: ");
        name = input.nextLine();
        System.out.print("Enter your University Name(In short form) : ");
        Uniname = input.nextLine();
    }
    public void MoreInfo()
    {
       for(int i=0; i>=0; i++){
       System.out.println("Upload a copy of your national ID card (jpeg or png) .");
       NID = input.nextLine();
       boolean nd1 = NID.contains(".png");
       boolean nd2 = NID.contains(".jpeg");
       if(nd1== true || nd2== true){
           System.out.println("Upload Successful..");
           MembershipAccount();
           break;
       }
       else
       {
           System.out.println("Unload Unsuccessful.. Try again..");
       }
       }
    }
    protected void MembershipAccount(){
        
        String s,u;
        s = name.substring(0, 3);
        u = s + Uniname + "@pathok";
        System.out.println("Congratulation !!! Now you are a member of RECITER Book Store.");
        System.out.println("Here is your member account no. : "+u);
        System.out.println("Keep it secret ..-_-");
        
    }
    
}
