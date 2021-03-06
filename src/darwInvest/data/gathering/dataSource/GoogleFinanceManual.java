package darwInvest.data.gathering.dataSource;

import java.util.Calendar;

import darwInvest.data.utility.Serializer;

/**
 * The GoogleFinanceManual reads .csv files generated by Google Finance,
 * downloaded manually and placed in the folder RawData/GoogleFinanceManual.
 * It also acts as a utility for automatic methods.
 * 
 * @author Andrew Perrault, Kevin Dolan
 */
public class GoogleFinanceManual extends CSVReader {

	public GoogleFinanceManual(Serializer serializer) {
		super("GoogleFinanceManual", serializer);
	}
	
	public int GoogletoMonth(String mon) {
		int month = 0;
		if (mon.equals("Jan"))
			month = Calendar.JANUARY;
		else if (mon.equals("Feb"))
			month = Calendar.FEBRUARY;
		else if (mon.equals("Mar"))
			month = Calendar.MARCH;
		else if (mon.equals("Apr"))
			month = Calendar.APRIL;
		else if (mon.equals("May"))
			month = Calendar.MAY;
		else if (mon.equals("Jun"))
			month = Calendar.JUNE;
		else if (mon.equals("Jul"))
			month = Calendar.JULY;
		else if (mon.equals("Aug"))
			month = Calendar.AUGUST;
		else if (mon.equals("Sep"))
			month = Calendar.SEPTEMBER;
		else if (mon.equals("Oct"))
			month = Calendar.OCTOBER;
		else if (mon.equals("Nov"))
			month = Calendar.NOVEMBER;
		else
			month = Calendar.DECEMBER;
		return month;
	}
	
	public String MonthtoGoogle(Calendar cal) {
		String month = null;
		if (cal.get(Calendar.MONTH)==Calendar.JANUARY)
			month = "Jan";
		else if (cal.get(Calendar.MONTH)==Calendar.FEBRUARY)
			month = "Feb";
		else if (cal.get(Calendar.MONTH)==Calendar.MARCH)
			month = "Mar";
		else if (cal.get(Calendar.MONTH)==Calendar.APRIL)
			month = "Apr";
		else if (cal.get(Calendar.MONTH)==Calendar.MAY)
			month = "May";
		else if (cal.get(Calendar.MONTH)==Calendar.JUNE)
			month = "Jun";
		else if (cal.get(Calendar.MONTH)==Calendar.JULY)
			month = "Jul";
		else if (cal.get(Calendar.MONTH)==Calendar.AUGUST)
			month = "Aug";
		else if (cal.get(Calendar.MONTH)==Calendar.SEPTEMBER)
			month = "Sep";
		else if (cal.get(Calendar.MONTH)==Calendar.OCTOBER)
			month = "Oct";
		else if (cal.get(Calendar.MONTH)==Calendar.NOVEMBER)
			month = "Nov";
		else
			month = "Dec";
		return month;
	}
	
}