import java.util.Scanner;
import java.io.*;

public class main{
	
	public static void main(String[] args){
		
		System.out.println("C A L C U L A T O R");
		PrintStream out;
		int l=1;
	
		do{
		
		try{
			out = new PrintStream ("calclog.txt");
		Scanner input = new Scanner(System.in);
		System.out.print("ENTER 1st NUMBER : ");
		double a = input.nextDouble();
		System.out.print("ENTER OPERATION  : ");
		String op = input.next();
		System.out.print("ENTER 2nd NUMBER : ");
		double b = input.nextDouble();
		
		Calculator ref ;
		
		switch(op){
			case "+" :			
			ref = new add(a,b);
			ref.value();
			break;
			case "-" :
			ref = new sub(a,b);
			ref.value();
			break;
			case "*" :
			ref = new mul(a,b);
			ref.value();
			break;
			case "/" :
			ref = new div(a,b);
			ref.value();
			break;
			case "^" :
			ref = new power(a,b);
			ref.value();
			break;
			case "%" :
			ref = new mod(a,b);
			ref.value();
			break;
			case "@" :
			l=2;
			default : 
			System.out.println("OPERATOR NOT FOUND !!!");
			}
		}catch(Exception ex){
			System.out.println("NUMBER NOT FOUND !!!");
			System.out.println("ENTER VALID NUMBER !!!");
		}
		finally{
			System.out.println("CALCULATION DONE.");
		}
		}while(l==1);
		{ 
         try
        {
	    File myObj = new File("calclog.txt"); 
	    Scanner myReader = new Scanner (myObj); 
	    while (myReader.hasNextLine()) { 
	    String data = myReader.nextLine(); 
	    System.out.println(data);
	    }
        myReader.close();
        } 
        catch (FileNotFoundException ex) 
        {
        System.out.println("ERROR OCCURED.");
        ex.printStackTrace();
      }
    }
		
		
	} 
}

