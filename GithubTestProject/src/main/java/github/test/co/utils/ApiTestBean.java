package github.test.co.utils;

import java.util.List;

public class ApiTestBean {

	List<ErrorArray> errorList;
	
	public static class ErrorArray{
		
		public String errorCode;
		
		public String msg;
	}
}
