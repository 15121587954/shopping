package cn.itcast;
import java.util.Scanner;  

	public class VerifyEqual {  
	
	    public VerifyEqual() {  
	    }  
	 
	    public boolean verify(String s, String s1) {  
	          
	        // 由用户输入用户名  
	        System.out.print("请输入用户名：");  
	        @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);  
	        String s2 = sc.next();  
	          
	        // 由用户输入密码  
	        System.out.print("请输入密码：");  
	        sc = new Scanner(System.in);  
	        String s3 = sc.next();  
	          
	        // 判断用户输入的信息是否和已有的信息一致  
	        return s2.equals(s) && s1.equals(s3);  
	    }  
	}
