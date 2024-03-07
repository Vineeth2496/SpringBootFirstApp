package com.FirstApp;

import org.springframework.beans.factory.annotation.Value;	
import org.springframework.stereotype.Component;

// ctrl + shift + O (imports) 
@Component("con")
public class MyConnection{
	@Value("oracle.jdbc.driver.OracleDriver")
	private String driver;
	@Value("jdbc:oracle:thin:@localhost:1521:xe")
	private String url;
	
	// Source menu > generate toString() > Finsh
	@Override
	public String toString() {
		return "MyConnection [driver=" + driver + ", url=" + url + "]";
	} 
}

