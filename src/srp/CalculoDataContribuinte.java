package srp;

import java.util.Calendar;
/**
 * 
 * @author Ribamar
 *	@category Single Responbility Principle 
 *	Only responsible for Calculate Date, Ages etc.
 */
public class CalculoDataContribuinte {

	public static int getCurrentYear() {
		return Calendar.getInstance().get(Calendar.YEAR);
	}

	public static int getIdadeContribuinte(Contribuinte contribuinte) {
		return getCurrentYear()- contribuinte.getAnoNascimento();
	}

}
