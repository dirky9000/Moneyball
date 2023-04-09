import java.util.Scanner;
import java.util.Arrays;

public class MoneyBallPart1{
	public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); 
        
        // Asks user to input number of years 
        System.out.print("Enter the number of years: ");
        int numberOfYears = scnr.nextInt();
        
        //Asks user to input starting year
        System.out.print("Enter the starting year: ");
        int startingYear = scnr.nextInt();
        
        // Array
        int[] stat = new int[100];  
        int[] years = new int[100];  
        
        // Increments number of years and user input for stat and then stored in stat array
        for(int i = 0; i < numberOfYears; i++){
            years[i] = startingYear;
            startingYear++;
            System.out.print("Enter stat for year " + years[i] + ": ");
            stat[i] = scnr.nextInt();
        }
        
        // First year and stat for min state and year 
        int minStat = stat[0];
        int minYear = years[0];
        
        // First year and start for max state and year
        int maxStat = stat[0];
        int maxYear = years[0];
        
        // This is to calc max and min stat from all the stats
        for(int j = 1; j < numberOfYears; j++){
            // This is used to calc max stat and keep year in maxYear
        	if(stat[j] > maxStat){
                maxStat = stat[j];
                maxYear = years[j];
            }
       
        	// This is used to calc min stat and keep year in minYear
            if(stat[j] < minStat){
                minStat = stat[j];
                minYear = years[j];
            }
        }

        // Displays output
        System.out.println("Best stat was " + maxStat + " in year " + maxYear);
        System.out.println("Worst stat was " + minStat + " in year " + minYear);
    }
}
