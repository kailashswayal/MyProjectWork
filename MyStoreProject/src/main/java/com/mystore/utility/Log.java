package com.mystore.utility;

import org.apache.log4j.Logger;

public class Log {
	
	//initialize log4j log
	public static Logger log= Logger.getLogger(Log.class.getName());
	
	public static void startTestCase(String sTestCaseName)
	{
		log.info("================="+sTestCaseName+" TEST START");
	}
	public static void endTestCase(String sTestCaseName)
	{
		log.info("================="+sTestCaseName+" TEST END");
	}
	
	//Need to crate below methods so they can be called
	public static void info(String message)
	{
		Log.info(message);
	}
	public static void warn(String message)
	{
		Log.info(message);
	}
	public static void error(String message)
	{
		Log.info(message);
	}
	public static void fetal(String message)
	{
		Log.info(message);
	}
	public static void debug(String message)
	{
		Log.info(message);
	}

}
