package cn.itcast;
import java.util.Scanner;  

	public class VerifyEqual {  
	
	    public VerifyEqual() {  
	    }  
	 
	    public boolean verify(String s, String s1) {  
	          
	        // ���û������û���  
	        System.out.print("�������û�����");  
	        @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);  
	        String s2 = sc.next();  
	          
	        // ���û���������  
	        System.out.print("���������룺");  
	        sc = new Scanner(System.in);  
	        String s3 = sc.next();  
	          
	        // �ж��û��������Ϣ�Ƿ�����е���Ϣһ��  
	        return s2.equals(s) && s1.equals(s3);  
	    }  
	}
