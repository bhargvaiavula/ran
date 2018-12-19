package testBase.java;

import java.io.File;

import java.io.FileReader;
import java.util.Properties;

public class TestBase
{
	static Properties pro;
	public static void loadproperty()
	{
		try 
		{
		File f=new File(System.getProperty("user.dir")+"\\src\\main\\java\\interfacefile\\config.properties");
		FileReader fr = new FileReader(f);
		pro=new Properties();
		pro.load(fr);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public String config(String key)
	{
		loadproperty();
		String x=pro.getProperty(key);
		return x;
	}
	

		public static void loadproperty2()
		{
			try 
			{
			File f=new File(System.getProperty("user.dir")+"\\src\\main\\java\\interfacefile\\OR.properties");
			FileReader fr = new FileReader(f);
			pro=new Properties();
			pro.load(fr);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		public static  String or(String key)
		{
			loadproperty2();
			String x=pro.getProperty(key);
			return x;
		}

	
		
	}


