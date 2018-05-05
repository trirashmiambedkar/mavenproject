package com.config;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import com.test.LaunchBrowserTest;
 


/**
 * @author Rash
 *
 */
public class Readproperties {
	static Properties prop = new Properties();
	static String filename = "C:\\Users\\Rash\\git\\mavenproject\\mv\\src\\main\\java\\com\\config\\config.properties";


	public static void main(String[] args) throws Exception
	{
		getpropertyfile();
		setpropertyfile();
		getpropertyfile();
	}

	public static void getpropertyfile() throws Exception 
	{
		InputStream input = new FileInputStream(filename);
		prop.load(input);
		LaunchBrowserTest.Browser = prop.getProperty("browser");
		System.out.println(	LaunchBrowserTest.Browser);
	}

	public static void setpropertyfile() throws Exception 
	{
		OutputStream out = new FileOutputStream(filename);
		prop.setProperty("browser", "Firefox");
		prop.store(out, null);
	}}
