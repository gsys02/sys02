package util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Util {
	
	public static Logger getLog(Object c){
		return LoggerFactory.getLogger(c.getClass());
	}

}
