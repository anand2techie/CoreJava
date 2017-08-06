package com.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class CapitalizedReader extends BufferedReader {

	public CapitalizedReader(Reader in) {
		super(in);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String readLine() throws IOException {
		// TODO Auto-generated method stub
		return super.readLine().toUpperCase();
	}
}
