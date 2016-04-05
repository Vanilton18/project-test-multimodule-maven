package net.vanilton.core.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Utils {

	public String getProperty(String key) {
		String result = null;
		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream(new File("src//test//resources//configurations.properties")));
			result = prop.getProperty(key);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;

	}

}
