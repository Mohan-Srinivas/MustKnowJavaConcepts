package log4jExamples;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyFileLog4jConfigurator
{

	static Logger logger=Logger.getLogger(PropertyFileLog4jConfigurator.class);
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("This is a debug");
		logger.info("This is a info");
		logger.warn("This is a Warning");
		logger.error("This is a error");
		logger.fatal("This is a fatal");
	}
}
