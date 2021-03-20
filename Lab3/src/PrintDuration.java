import java.time.LocalDate;
import java.time.Period;

public class PrintDuration {

	public static void main(String[] args) {
		 {
		        LocalDate pdate = LocalDate.of(1999, 05, 27);
		        LocalDate now = LocalDate.now();
		 
		        Period diff = Period.between(pdate, now);
		 
		     System.out.println("Difference in year is: "+diff.getYears()+ " Years " +diff.getMonths()+ " months " +diff.getDays()+ " days");
		  }	

	}

}
