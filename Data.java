package cn.itcast;

public class Data {

	 public Data() {  	        
	        custNo      = new int[100]   ;  
	        custBirth   = new String[100];  
	        custScore   = new int[100]   ;  
	        manager     = new Manager()  ;  
	    }  
	  
	    /** 
	     * ��ʼ����������� 
	     *  
	     */  
	    public void initial() {         
	          
	        /*====================����˳�ʼ��4���˿���Ϣ====================*/  
	        custNo   [0] = 1234;  
	        custBirth[0] = "08/05";  
	        custScore[0] = 2000;  
	        
	        custNo   [1] = 2234;  
	        custBirth[1] = "07/13";  
	        custScore[1] = 4000;  
	        
	        custNo   [2] = 3234;  
	        custBirth[2] = "06/26";  
	        custScore[2] = 5000;  
	        
	        custNo   [3] = 3234;  
	        custBirth[3] = "04/08";  
	        custScore[3] = 2200;  
	       
	    }  
	  
	    /*====================���������ӵ�еı���====================*/  
	    
	    public int  custNo    [];   // �˿͵Ļ�Ա��  
	    public String   custBirth [];   // �˿͵�����  
	    public int  custScore [];   // �˿͵Ļ���  
	    public Manager  manager ;   // ����Ա�࣬�����洢�˹���Ա���û���������  
	}  
