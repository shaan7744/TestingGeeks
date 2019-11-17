package com.syska.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
Properties pro;
public ReadConfig()
{
	File src=new File("./Configuration/config.properties");
	try {
		FileInputStream fis=new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);
	}catch (Exception e)
	{
		System.out.println("Exception is "+e.getMessage());
	}
}
public String getApplicatioUrl()
{
	String url=pro.getProperty("url");
	return url;
}
public String getfullName()
{
	String name=pro.getProperty("fullName");
	return name;
}
public String getemailId()
{
	String mail=pro.getProperty("emailId");
	return mail;
}
public String getpassword()
{
	String password=pro.getProperty("password");
	return password;
}
public String getSub_Email()
{
	String sub_email=pro.getProperty("sub_email");
	return sub_email;
}
}
