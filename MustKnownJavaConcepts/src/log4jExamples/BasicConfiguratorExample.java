package log4jExamples;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicConfiguratorExample 
{
	static Logger logger=Logger.getLogger(BasicConfigurator.class);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BasicConfigurator.configure();
		logger.debug("This is a	debug message");
		logger.info("This is a info");
		logger.warn("This is a Warning");
		logger.error("This is a error");
		logger.fatal("This is a Fatal");
	}
}
