
package bookstore;

import java.io.*;
import java.util.Scanner;

public class Donate extends NewMemberShipRequest implements BookStore1{
    String  MemAccountNo;
    int days, flag=0;    
 
  
    @Override
   public void MemberShipVarification()
    {
       for(int i=0; i>=0; i++){
        System.out.print("Enter your membership account no. : ");
        MemAccountNo = input.next();
       String s = name.substring(0, 3);
       String  u = s + Uniname + "@pathok";
        if(u.equals(MemAccountNo))
        {
            System.out.println("Your verification process was successful \n   ***WELCOME***");
             flag=1;
             break;
            
        } else {
            System.out.println("Your MemberShip Account no. was incorrect.\nSo, You can't be allowed to enter here.\n ***SORRY***");
        }
       }
        
    }
    @Override
    public void DonateBookInfo()
    {
        if(flag==1){
       Scanner inp = new Scanner(System.in);
            System.out.println("Enter the book name:");
           String nbook = inp.nextLine();
           System.out.println("Enter the writer name: ");
           String wbook = inp.nextLine();
           System.out.println("Do you want to donate this book part-time or permanently?");
           String choise = inp.nextLine();
           
           if(choise.equalsIgnoreCase("Part-time"))
           {
               System.out.println("How many days do you want to donate this book?");
               days = inp.nextInt();
               System.out.println("Your book "+nbook+" has been uploaded for "+days+" Days.");
           }
           else{
           System.out.println("Your book "+nbook+" has been uploaded.");
           }
       try {
		File myFile = new File("Book.txt");
            FileWriter myWriter = new FileWriter(myFile, true);
            myWriter.write("\r\nDonator Name:"+name+"\r\nBook Name:"+ nbook+"\t Book Writer Name:"+ wbook+"\r\nBook Donate time:"+ choise);
            if(choise.equalsIgnoreCase("Part-time")){
               myWriter.write("(For"+days+" days)"); 
               myWriter.close();
            }
            myWriter.close();
            System.out.println("Your book donation process has been successfully completed.");
             System.out.println("Do you want to donate another Book?");
        } catch (IOException e) {
            System.out.println("Your book donation process has been successfully completed.\r\nThe occurred Exception is "+e);
            e.printStackTrace();
        }
        }

       }
   /* public void ReturnBook(){
        Scanner inp = new Scanner(System.in);
         System.out.println("Enter the Book Name:");
         String Bname= inp.nextLine();
         System.out.println("Enter the writer name:");
         String Bwriter = inp.nextLine();
         System.out.println("How many days have you donated this book?");
         int choise = inp.nextInt();
         String c = String.valueOf(choise);
           try{
              
           File file = new File("C:/Users/Mustafa Zamal/Desktop/hridita/JAVA/BookStore/Book.txt");
           Scanner scanner = new Scanner(file);
           while(scanner.hasNext()){
               String data = scanner.nextLine();
               if(data.contains(name)){
                   data = scanner.nextLine();
               if(data.contains(Bname)&& data.contains(Bwriter)){
                   data = scanner.nextLine();
                  if(data.contains("Part-time") && data.contains(c))
                  {
                     data = data.replaceAll(data, null);
                      System.out.println("done");
                  }
               }

           }
           }

           
       } catch (FileNotFoundException e) {
            System.out.println("An exception occurred."+e);
            e.printStackTrace();
        } 
    }*/

    
    @Override
       public void PostBlogInfo(){
           if(flag==1){
       Scanner inp = new Scanner(System.in);
       for(int i=0; i>=0; i++){
           System.out.println("Enter the Blog title:");
           String Blogname = inp.nextLine();
           System.out.println("Upload your blog (pdf formet):");
           String pb = inp.nextLine();
           boolean pb1 = pb.contains(".pdf");
           if(pb1== true ){
           System.out.println("Upload Successful..");
                       try {
		File myFile = new File("Blog.txt");
            FileWriter myWriter = new FileWriter(myFile, true);
            myWriter.write("\r\nBlog Title:"+Blogname+"\r\nBlog Writer Name:"+name+"\r\nBlog Link:"+pb+"\r \n");
            myWriter.close();
            System.out.println("Your blog "+Blogname+" has been posted.");
            System.out.println("Do you want to post another Blog?");
            
        } catch (IOException e) {
            System.out.println("Your blog "+Blogname+" has not been posted.\r\nThe occurred Exception is "+e);
            e.printStackTrace();
        }
           break;
           }
       
          else
          {
           System.out.println("Unload Unsuccessful.. Try again..");
         
          }
       }
           }    
       
    }

    @Override
       public void PostPodcastInfo()
       {
           if(flag==1){
       Scanner inp = new Scanner(System.in);
        for(int i=0; i>=0; i++){
          
           System.out.println("Enter the podcast title:");
            String Pname = inp.nextLine();
            System.out.println("Enter the podcast writer name:");
          String  Wpodcast = inp.nextLine();
           System.out.println("Upload your podcast (mp3 file):");
           String pb = inp.nextLine();
           boolean pb1 = pb.contains(".mp3");
           if(pb1== true ){
           System.out.println("Upload Successful..");
                            try {
            File myFile = new File("PodCast.txt");
            FileWriter myWriter = new FileWriter(myFile, true);
            myWriter.write("\r\nPodcast Title:"+Pname+"\tPodcast Writer Name:"+Wpodcast);
            myWriter.write("\r\nPodcast Creator Name:"+name+"\r\nPodcast File:"+pb+"\r \n");
            myWriter.close();
             System.out.println("Your podcast "+Pname+" has been posted.");
             System.out.println("Do you want to post another podcast?");
             break;
        } catch (IOException e) {
            System.out.println("Your podcast "+Pname+" has not been posted.\r\nThe occurred Exception is "+e);
            e.printStackTrace();
        }
         
       }
       else
       {
           System.out.println("Unload Unsuccessful.. Try again..");
       }
       
           }    
        
       }

       }
}
