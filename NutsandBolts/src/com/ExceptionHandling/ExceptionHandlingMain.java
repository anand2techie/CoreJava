package com.ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionHandlingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		learnExcHandling(bufferedReader);
		
		
	}

	private static String learnExcHandling(BufferedReader bufferedReader) {
		
		int indexToBeAccessed =0;
		try {
			bufferedReader.readLine(); // checked exceptions (IOException) -
										// which is thrown by the called method

			String[] names = new String[1];

			indexToBeAccessed = 2;

			if (indexToBeAccessed > names.length) {
				throw new IndexOutOfBoundsException();
			} else {
				System.out.println(names[indexToBeAccessed]);
			}

			Connection connection = DriverManager.getConnection("", "", ""); // checked
																				// exceptions
																				// (SQLException)
																				// (are
																				// explicitly
																				// thrown
																				// by
																				// the
																				// called
																				// method)
		} catch (SQLException e) {
			System.out.println("");
		} catch (IOException e) {
			System.out.println("");
		} catch (Exception e) {
			System.out.println("");
		} finally {

		}
		System.out.println(indexToBeAccessed);
		return "test";
	}

}
