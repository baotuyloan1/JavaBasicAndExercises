/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Apr 16, 2023
 * @version 1.0
*/
package com.excerise.sample;

public class SpringLog {
	public static void main(String[] args) {
		System.out.println(LogLevels.message("[ERROR]: \t Corrupt disk\t \t \r\n"));
		System.out.println(LogLevels.logLevel("[ERROR]: \t Corrupt disk\t \t \r\n"));
		System.out.println(LogLevels.reformat("[ERROR]: \t Corrupt disk\t \t \r\n"));
	}

	public class LogLevels {

		public static String message(String logLine) {
			logLine = logLine.replaceAll("[\r\n\t\\[\\]]", "");
			String[] arrOfStr = logLine.split(":", 2);
			return arrOfStr[1].trim();
		}

		public static String logLevel(String logLine) {
			logLine = logLine.replaceAll("[\r\n\t\\[\\]]", "");
			String[] arrOfStr = logLine.split(":", 2);
			return arrOfStr[0].trim().toLowerCase();
		}

		public static String reformat(String logLine) {
			logLine = logLine.replaceAll("[\r\n\t\\[\\]]", "");
			String[] arrOfStr = logLine.split(":", 2);
			return arrOfStr[1].trim() + " (" + arrOfStr[0].trim().toLowerCase() + ")";
		}
	}

}
