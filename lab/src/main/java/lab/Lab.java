package lab;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/** 
 * this class contains provided code
 */
public class Lab {
	static Date today = new Date();
/** This method takes fahrenheit input and gives centigrade
	 * @author Zahir
	 * @param fahrenheit takes fahrenheit number as input
	 * @return gives centigrade
 */
	public static int fahrenheitToCentigrade(int fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}
	
	/** This method takes centigrade input and gives fahrenheit
		 * @author Zahir
		 * @param centigrade takes centigrade number as input
		 * @return gives fahrenheit
	 */
	public static int centigradeToFahrenheit(int centigrade) {
		return centigrade * 9 / 5 + 32;
	}
	
	/** This method takes string and removes Exclaimatoin
		 * @author Zahir
		 * @param in takes string
		 * @return gives string without Exclaimation
	 */
	public static String removeSignOfExclaimation(String in) {
		if (in == null || in.length() == 0)
			return in;
		return in.replaceAll("!", "");
	}
	
	/** This method gives current day
		 * @author Zahir
		 * @return current day
	 */
	public static int getCurrentDay() {
		LocalDate localDate = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return localDate.getDayOfMonth();
	}
	
	/** This method gives current month
		 * @author Zahir
		 * @return current month
	 */
	public static int getCurrentMonth() {
		LocalDate localDate = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return localDate.getMonthValue();
	}
	
	/** This method gives current year
		 * @author Zahir
		 * @return current year
	 */
	public static int getCurrentYear() {
		LocalDate localDate = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return localDate.getYear();
	}
}