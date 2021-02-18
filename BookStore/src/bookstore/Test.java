
package bookstore;

import java.util.Scanner;

public class Test {
        public static void main(String[] args) {
            
              while(true){
            try{
            int choice;
            int n;
            Scanner input = new Scanner(System.in);
            System.out.println("\t      ****Welcome to RECITER Book Store.****");
            System.out.println("\t       The best online book borrow website ");
            System.out.println();
       
            System.out.println("\t1.Borrow Books.\t\t2.Want Podcasts.\t3.Want Blogs.\t\t4.Want to be a Member.");
            System.out.println("\t5.Donate Books.\t\t6.Post Podcasts.\t7.Post Blogs\r\n");
          

            System.out.println("Choose an (full) option from here: ");
            choice = input.nextInt();


           
            if(choice==1)
            { 
                Borrow m1 = new Borrow(); 
                m1.CustomerInfo();
                m1.BorrowBookInfo();
                m1.DelivaryPrice();
                m1.BookBorrowInfoStore();
                break;
            }
            else if(choice==2)
            {
                Borrow m1 = new Borrow();
                m1.WantPodcast();
                break;
            }
            else if(choice==3)
            {
                Borrow m1 = new Borrow();
                m1.WantBlogs();
                break;
            }
            else if(choice==4)
            {
            NewMemberShipRequest m1 = new NewMemberShipRequest();
            m1.Info();
            m1.MoreInfo();
            break;
            }
            else if(choice==5)
            {
                Donate[] s= new Donate[100];
                Donate m = new Donate();
                
                for(int i=0;i>=0;i++){
                s[i]=m;
                if(i==0){
                s[i].Info();
                s[i].MemberShipVarification();
                s[i].DonateBookInfo();
                }
                else{
                s[i].DonateBookInfo();
                }
               
                String c = input.next();
                if(c.equalsIgnoreCase("No")){
                    System.out.println("\r\n\tThank you so much...Stay with us."); 
                    break;
                }
                }
              break; 
            }
            else if(choice==6)
            {
                Donate[] s= new Donate[100];
                Donate m = new Donate();
                for(int i=0;i>=0;i++){
                s[i]=m;
                if(i==0){
                s[i].Info();
                s[i].MemberShipVarification();
                s[i].PostPodcastInfo();
                }
                else{
                s[i].PostPodcastInfo();
                }
              
                String c = input.next();
                if(c.equalsIgnoreCase("No")){
                    System.out.println("\r\n\tThank you so much...Stay with us.");
                    break;
                }
                }
              break;
            }
            else if(choice==7)
            {
                Donate[] s= new Donate[100];
                Donate m = new Donate();
                for(int i=0;i>=0;i++){
                s[i]=m;
                if(i==0){
                s[i].Info();
                s[i].MemberShipVarification();
                s[i].PostBlogInfo();
                }
                else{
                s[i].PostBlogInfo();
                }
                
                String c = input.next();
                if(c.equalsIgnoreCase("No")){
                    System.out.println("\r\n\tThank you so much...Stay with us.");
                    break;
                }
                }
                break;
              
            }
            else{
                System.out.println("Wrong option ...Choose between 1 to 7 .");
            }
            }
            catch(Exception e){
             System.out.println("Error occurred: "+e);
                System.out.println("Please try again...");
         
               
            }
           }
            
            }
    
}
