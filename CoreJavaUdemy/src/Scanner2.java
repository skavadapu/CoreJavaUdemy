import java.util.Scanner;

class Scanner2 {
	String username;
  public static void main(String[] args) {
	  Scanner2 sec = new Scanner2();
    sec.userinput();
    System.out.println(sec.username);
    
    
  }
  
  public void userinput(){
     
  Scanner scan = new Scanner (System.in);
  //String username;
  System.out.println("Input username");
  username=scan.nextLine();
  System.out.println("user input is: " + username); 
  
  }}

