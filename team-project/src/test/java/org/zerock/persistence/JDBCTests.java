package org.zerock.persistence;

import static org.junit.Assert.fail;	

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	String url = "jdbc:log4jdbc:oracle:thin:@db202101041123_high?TNS_ADMIN=/home/opc/wallet";
	String id = "admin";
	String pw = "oracle12Oracle";
	
	@Test
	public void testConnection()  {
		try(Connection con = DriverManager.getConnection(url, id, pw);){
			log.info(con);
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}
}
