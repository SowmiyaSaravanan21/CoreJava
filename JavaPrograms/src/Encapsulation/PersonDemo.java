package Encapsulation;
import java.util.Scanner;
public class PersonDemo {
   public static void main(String[] args) {
		// scanner object to accept user inputs
	   Scanner ob=new Scanner(System.in);
	   System.out.println("enter person name:");
	   String name=ob.next();
	   System.out.println("Enter Age:");
	   int age=ob.nextInt();
	   System.out.println("Enter the income:");
	   int income=ob.nextInt();
	   System.out.println("Enter gender:");
	   String gender=ob.next();
	    //person object and initialize values using setter
	   Person person=new Person();
	   person.setName(name);
	   person.setAge(age);
	   person.setIncome(income);
	   person.setGender(gender);
	    //display person details using tostring() method
	   System.out.println(person);
	   TaxCalculation calc=new TaxCalculation();
	   calc.calculateTax(person);//Tax calculation
	   System.out.println("After calculating tax:");
	   System.out.println(person);
	   ob.close();
   }

}
