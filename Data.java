package cn.itcast;

public class Data {

	 public Data() {  	        
	        custNo      = new int[100]   ;  
	        custBirth   = new String[100];  
	        custScore   = new int[100]   ;  
	        manager     = new Manager()  ;  
	    }  
	  
	    /** 
	     * 初始化该类的数据 
	     *  
	     */  
	    public void initial() {         
	          
	        /*====================添加了初始的4个顾客信息====================*/  
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
	  
	    /*====================定义该类所拥有的变量====================*/  
	    
	    public int  custNo    [];   // 顾客的会员号  
	    public String   custBirth [];   // 顾客的生日  
	    public int  custScore [];   // 顾客的积分  
	    public Manager  manager ;   // 管理员类，仅仅存储了管理员的用户名和密码  
	}  
