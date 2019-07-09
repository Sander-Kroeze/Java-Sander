package Les8_H13_Opdracht;

// haalt de kalender gegevens op
import java.util.Calendar; 
public class tijd { 
    public static void main(String args[]) { 
//    	Calendar.getInstance haalt de locale tijd op
        Calendar c = Calendar.getInstance(); 
//      geeft de lokale tijd en datum weer
        System.out.println(c.getTime()); 
    } 
} 
