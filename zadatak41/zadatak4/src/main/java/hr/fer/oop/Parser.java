package hr.fer.oop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class Parser {
	
	public static Reading parseInputString(String inputReadingString) throws ParseReadingException{
		int counter = 0;
		Integer id = null;
		LocalDate date = null;
		String[] input = inputReadingString.split(",");
		SensorReadingValue[] attributes = new SensorReadingValue[input.length-2];
		for (int i = 0;i < input.length;i++) {
			
				if (input.length < 3) throw new IncorrectReadingFormatException();
				if (i == 0) {
					
					String[] deviceId = input[i].split("deviceId:");
					try {
						id = Integer.parseInt(deviceId[1]);
					} catch (RuntimeException e) {
						throw new FormatException(e);
					}
					
				} else if (i == 1) {
					
					String[] dateS = input[i].split("timestamp:");
					try {
						date = Parser.parseDate(dateS[1]);
					} catch (NumberFormatException | DateTimeParseException e) {
						throw new FormatException(e);
					}
				} else if (i > 1) {
					try {
						String[] attNameValue = input[i].split(":");
						SensorReadingValue sensor = new SensorReadingValue(attNameValue[0], attNameValue[1]);
						attributes[i-2] = sensor;
					} catch (NumberFormatException e) {
						attributes[i-2] = null;
					}
				}		
				
		}
		
		for (int i = 2; i<input.length;i++) {
			for (SensorReadingValue s: attributes) {
				if (s != null) {
					counter++;
				}
			}
		}
		
		if (counter == 0) throw new ReadingsFormatException();
		try {
			return new Reading(id, attributes, date);
		} catch (Exception e) {
			return null;
		}
	}
	
	private static LocalDate parseDate (String dateA) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		dtf = dtf.withLocale( Locale.GERMAN );
		LocalDate date = LocalDate.parse(dateA, dtf);
		
		return date;
	}

}
