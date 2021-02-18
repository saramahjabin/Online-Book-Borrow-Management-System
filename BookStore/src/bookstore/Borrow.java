
package bookstore;

import java.io.*;

import java.util.Date;
import java.util.Scanner;

public class Borrow implements BookStore2 {
    Scanner input = new Scanner(System.in);
    String  name, Bname, Bwriter, NID , address, BTitle, PTitle, pWriter ;
    int choise, flag = 0;
    @Override
    public void CustomerInfo(){
       System.out.print("Enter your Name: ");
       name = input.nextLine();
        for(int i=0; i>=0; i++){
       System.out.println("Upload a copy of your national ID card (jpeg or png) .");
       NID = input.nextLine();
       boolean nd1 = NID.contains(".png");
       boolean nd2 = NID.contains(".jpeg");
       if(nd1== true || nd2== true){
           System.out.println("Upload Successful..");
           break;
       }
       else
       {
           System.out.println("Unload Unsuccessful.. Try again..");
       }
       }
         System.out.println("Enter your address:");
         address = input.nextLine();  
    }
    @Override
     public void  BorrowBookInfo(){

         System.out.println("Enter the Book Name:");
         Bname= input.nextLine();
         System.out.println("Enter the writer name:");
         Bwriter = input.nextLine();
         System.out.println("How many days do you want to borrow the book?");
         choise = input.nextInt();
         

           try{
              
           File file = new File("C:/Users/Mustafa Zamal/Desktop/hridita/JAVA/BookStore/Book.txt");
           Scanner scanner = new Scanner(file);
           while(scanner.hasNext()){
               String data = scanner.nextLine();
               if(data.contains(Bname)&& data.contains(Bwriter)){
                   System.out.println("This book is available.");
                   flag = 1;
                   break;
               }
             else
               {
                 flag = 2;  
               }
           }
           if(flag==2){
               System.out.println("\tThis book is not available.");
           }
           
       } catch (FileNotFoundException e) {
            System.out.println("An exception occurred."+e);
            e.printStackTrace();
        } 
     }
    @Override
     public void BookBorrowInfoStore(){
         if(flag==1){
             Date date = new Date();
                       try {
		File myFile = new File("BorrowBookRequest.txt");
            FileWriter myWriter = new FileWriter(myFile, true);
            myWriter.write("\r\nCustome Name:"+name+"\r\nBook Name:"+ Bname+"\r\nBook Writer Name:"+ Bwriter+"\r\nNational ID:"+NID+"\r\nDonate Time:"+choise+"\r\nAddress:"+address+"\r\nDate:"+date );
            myWriter.close();
            System.out.println("Your request for "+Bname+" book has been stored.");
        } catch (IOException e) {
            System.out.println("Your request for "+Bname+" book has not been stored.The occurred Exception is:"+e);
            e.printStackTrace();
        }
         }
     }
     public void DelivaryPrice(){
      
     
          if(flag ==1){ 
              for(;;){
     if(address.contains("Dhaka")){
         System.out.println("\tYour delivery charge is 20 Tk.\r\n\tYou will receive this book in 1 day.\r\n\tThank you so much...Stay with us. ");
       break;
     }
     else if(address.contains("Khulna")){
         System.out.println("\tYour delivery charge is 50 Tk.\r\n\tYou will receive this book in 7 days.\r\n\tThank you so much...Stay with us. ");
       break;
     }
     else if(address.contains("Mymensingh")){
         System.out.println("\tYour delivery charge is 30 Tk.\r\n\tYou will receive this book in 2 days.\r\n\tThank you so much...Stay with us. ");
        break;
     }
     else if(address.contains("Barishal"))    	{
         System.out.println("\tYour delivery charge is 60 Tk.\r\n\tYou will receive this book in 7 days.\r\n\tThank you so much...Stay with us.");
         break;
     } 
     else if(address.contains("Chittagong")){
         System.out.println("\tYour delivery charge is 80 Tk.\r\n\tYou will receive this book in 7 days.\r\n\tThank you so much...Stay with us.");
         break;
     }
     else if(address.contains("Rajshahi")){
         System.out.println("\tYour delivery charge is 70 Tk.\r\n\tYou will receive this book in 7 days.\r\n\tThank you so much...Stay with us.");
         break;
     }
     else if(address.contains("Sylhet")){
         System.out.println("\tYour delivery charge is 80 Tk.\r\n\tYou will receive this book in 7 days.\r\n\tThank you so much...Stay with us.");
         break;
     }
     else if(address.contains("Rangpur")){
         System.out.println("\tYour delivery charge is 80 Tk.\r\n\tYou will receive this book in 7 days.\r\n\tThank you so much...Stay with us.");
        break;
     }
     else {
         Scanner inp = new Scanner(System.in);
      System.out.print("Your address is not properly given. Please give us the full address:");
      address = inp.nextLine();  
   
     }
     }
          }
}
    @Override
   public  void WantPodcast(){
       int c=1;
        System.out.println("Enter the podcast title:");
        PTitle= input.nextLine();
        System.out.println("Enter the podcast writer name:");
        pWriter= input.nextLine();
                try{
              
           File file = new File("C:/Users/Mustafa Zamal/Desktop/hridita/JAVA/BookStore/PodCast.txt");
           Scanner scanner = new Scanner(file);
           while(scanner.hasNext()){
               String data = scanner.nextLine();
               if(data.contains(PTitle) && data.contains(pWriter)){
                   System.out.println("Available Podcast No."+c);
                       System.out.println(data);
                            scanner.hasNext();
                            data = scanner.nextLine();
                            System.out.println(data);
                            data = scanner.nextLine();
                            System.out.println(data);
                   c++;
                   flag = 1;
               }
             else
               {
                 flag = 2;  
               }
           }
           if(flag==2){
               System.out.println("\tThis Podcast is not available.");
           }
           
       }  catch (FileNotFoundException e) {
            System.out.println("An exception occurred:"+e);
            e.printStackTrace();
        } 
   }
    @Override
   public void WantBlogs(){
             int c=1;
        System.out.println("Enter the blog title:");
        BTitle= input.nextLine();
                try{
              
           File file = new File("C:/Users/Mustafa Zamal/Desktop/hridita/JAVA/BookStore/Blog.txt");
           Scanner scanner = new Scanner(file);
           while(scanner.hasNext()){
               String data = scanner.nextLine();
               if(data.contains(BTitle)){
                   System.out.println("Available Blog No."+c);
                       System.out.println(data);
                            scanner.hasNext();
                            data = scanner.nextLine();
                            System.out.println(data);
                            data = scanner.nextLine();
                            System.out.println(data);
                   c++;
                   flag = 1;
               }
             else
               {
                 flag = 2;  
               }
           }
           if(flag==2){
               System.out.println("\tThis Blog is not available.");
           }
           
       }  catch (FileNotFoundException e) {
            System.out.println("An exception occurred:"+e);
         
        }  
   }


     }

