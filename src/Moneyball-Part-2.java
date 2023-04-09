import java.util.Scanner;
import java.util.Arrays;

public class MoneyBallPart2{
   public static void main(String[] args){
	   Scanner scnr = new Scanner(System.in);
	
	   // Allows user to enter number of years
	   System.out.print("Enter the number of years: ");
	   int numberOfYears = scnr.nextInt();
	  
	   // Allows user to enter starting year
	   System.out.print("Enter the starting year: ");
	   int startYear = scnr.nextInt();
	   
	   // Arrays
	   int stat[] = new int[numberOfYears];
	   int year[] = new int[numberOfYears];
	 
	   // Gets stat of each year 
	   for(int i = 0; i < numberOfYears; i++){
	   System.out.print("Enter stat for year " + startYear + ": ");
	   stat[i] = scnr.nextInt();
	   year[i] = startYear;
	  
	   startYear++;
	   }
	  
	   // Sorts array
	   for(int i = 0; i < numberOfYears; i++){
		   for(int j = 0; j < numberOfYears; j++){
			   if(stat[i] < stat[j])
			   {	
				   // Swaps the values 
				   int temp = stat[i];
				   stat[i] = stat[j];
				   stat[j] = temp;
	  
				   temp = year[i];
				   year[i] = year[j];
				   year[j] = temp;
			   }
		   }
	   }
	  
	   // Displays output
	   for(int i = 0; i < numberOfYears; i++){
		   System.out.print(year[i] + "|");
	   }
   }
}