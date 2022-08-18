package log4jExamples;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class XMLConfiguratorLog4J 
{
	static Logger logger=Logger.getLogger(XMLConfiguratorLog4J.class);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		DOMConfigurator.configure("log4j.xml");
		logger.debug("This is a debug mss");
		logger.info("This is an Information");
		logger.warn("This is a warning");
		logger.error("This is an Error");
		logger.fatal("This is a fatal");
	}

}
