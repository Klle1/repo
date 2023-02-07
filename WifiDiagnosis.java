/* 

 * Class: CMSC203  

 * Instructor: Dr. Grinberg

 * Description: Build an application that will step through some possible problems to restore internet connectivity.  Assume that your computer uses wi-fi to connect to a router which connects to an Internet Service Provider (ISP) which connects to the Internet. 

 * Due: 02/06/2023

 * Platform/compiler: Eclipse

 * I pledge that I have completed the programming  

 * assignment independently. I have not copied the code  

 * from a student or any source. I have not given my code  

 * to any student. 

   Print your Name here: Kyle Newby_ 

*/ 

import java.util.Scanner;
public class WifiDiagnosis {

 public static void main(String[] args) {
  String user_input = null;
  Scanner sc=new Scanner(System.in);
  System.out.println("Reboot the computer and try to connect");
  System.out.println("Did that fix the problem?");
  
  user_input = sc.nextLine();
  if(user_input.equalsIgnoreCase("Yes")) {
  System.out.println("Done");
  System.out.println("Programmer: Kyle Newby");
  }
  else if(user_input.equalsIgnoreCase("No")) {
   System.out.println("Reboot the router and try to connect ");
   System.out.println("Did that fix the problem?");
   user_input = sc.nextLine();
   
   if(user_input.equalsIgnoreCase("Yes")) {
  System.out.println("Done");
  System.out.println("Programmer: Kyle Newby");
  }
   else if(user_input.equalsIgnoreCase("No")) {
    System.out.println("Make sure the cables connecting the router are firmly plugged in and power is getting to the router ");
    System.out.println("Did that fix the problem?");
    user_input = sc.nextLine();
    
    if(user_input.equalsIgnoreCase("Yes")) {
  System.out.println("Done");
  System.out.println("Programmer: Kyle Newby");
  }
    else if(user_input.equalsIgnoreCase("No")) {
     System.out.println("Move the computer closer to router and try to connect ");
     System.out.println("Did that fix the problem?");
     user_input = sc.nextLine();
     
     if(user_input.equalsIgnoreCase("Yes")) {
  System.out.println("Done");
  System.out.println("Programmer: Kyle Newby");
  }
     else if(user_input.equalsIgnoreCase("No")) {
      System.out.println("Contact your ISP");
      System.out.println("Done");
      System.out.println("Programmer: Kyle Newby");
     }
    }
   }
  }
        
 }

}