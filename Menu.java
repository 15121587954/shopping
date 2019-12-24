package cn.itcast;
import java.util.Scanner; /** 
 * �˵��࣬������ʾ���м��˵����û�ѡ�� */ 
public class Menu {

	public Menu() {  
    }  
  
    /** 
     * ���ò˵����е�������Ϣ 
     *  
     * @param ai 
     * @param as1 
     * @param ai1 
     */  
    public void setData(int ai[], String as1[], int ai1[]) {  
        
        custNo      = ai;  
        custBirth   = as1;  
        custScore   = ai1;  
    }  
  
    /** 
     * ��ʾһ���˵�������¼���� 
     *  
     */  
    public void showLoginMenu() {  
        System.out.println("\n\n\t\t\t    ��ӭʹ�ò�ϦϦ������Ա����ϵͳ\n\n");  
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");  
        System.out.println("\t\t\t\t 1. �� ¼ ϵ ͳ\n\n");  
        System.out.println("\t\t\t\t 2. �� �� �� �� Ա �� Ϣ\n\n");  
        System.out.println("\t\t\t\t 3. �� ��\n\n");  
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");  
        System.out.print("��ѡ��,��������:");  
    }  
  
    /** 
     * ��ʾ�����˵�����ϵͳ�����˵������������������˶�����˵�������������� 
     *  
     */  
    @SuppressWarnings("resource")
	public void showMainMenu() {  
          
        // ��ʾ�����˵�����ϵͳ�����˵�  
        System.out.println("\n\n\t\t\t\t��ӭʹ�ù���ϵͳ\n");  
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");  
        System.out.println("\t\t\t\t 1. �� �� �� Ϣ �� ��\n");  
              
        System.out.println("\t\t\t\t 2. �˳�\n");  
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");  
          
        // �û�ѡ�������Ŀ  
        System.out.print("��ѡ��,��������:");  
        Scanner scanner = new Scanner(System.in);  
          
        // ���ñ�־���ڿ���ѭ��  
        boolean flag = false;  
        do {  
            String s = scanner.next();  
              
            // �û�ѡ��"�ͻ���Ϣ����"  
            if (s.equals("1")) {  
                // ��ʾ�ͻ���Ϣ����˵�����������˵����������̣���������̴�����  
                showCustMMenu();  
                break;  
            }             
            // �û�ѡ��"�˳�"  
            if (s.equals("3")) {  
                // ��ʾһ���˵�����ʱ�᷵����StartSMS���е�һ���˵���������  
                showLoginMenu();  
                break;  
            }  
              
            System.out.print("��������������������֣�");  
            flag = false;  
        } while (!flag);  
    }  
  
    /** 
     * ��ʾ�����˵�-�ͻ���Ϣ�������������пͻ���Ϣ��������� 
     *  
     */  
    @SuppressWarnings("resource")
    
	public void showCustMMenu() {  
        System.out.println("����ϵͳ > �ͻ���Ϣ����\n");  
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");  
        System.out.println("\t\t\t\t 1. �� ʾ �� �� �� �� �� Ϣ\n");  
        System.out.println("\t\t\t\t 2. �� �� �� �� �� Ϣ\n");  
        System.out.println("\t\t\t\t 3. �� �� �� �� �� Ϣ\n");  
        System.out.println("\t\t\t\t 4. �� ѯ �� �� �� Ϣ\n");  
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");  
        System.out.print("��ѡ��,�������ֻ�'n'������һ���˵�:");  
        Scanner scanner = new Scanner(System.in);  
          
        boolean flag = true;  
        do {  
            // �����ͻ���Ϣ������󣬲��������ݣ���������ݻ���ԭʼ����Щ����  
            CustMangement custmanagement = new CustMangement();  
            custmanagement.setData( custNo, custBirth, custScore);  
              
            String s = scanner.next();  
              
            // �ͻ�ѡ��"��ʾ���пͻ���Ϣ"  
            if (s.equals("1")) {  
                custmanagement.show();  
                break;  
            }  
              
            // �ͻ�ѡ��"��ӿͻ���Ϣ"  
            if (s.equals("2")) {  
                custmanagement.add();  
                break;  
            }  
              
            // �ͻ�ѡ��"�޸Ŀͻ���Ϣ"  
            if (s.equals("3")) {  
                custmanagement.modify();  
                break;  
            }  
              
            // �ͻ�ѡ��"��ѯ�ͻ���Ϣ"  
            if (s.equals("4")) {  
                custmanagement.search();  
                break;  
            }  
              
            // �ͻ�ѡ��"������һ���˵�"  
            if (s.equals("n")) {  
                showMainMenu();  
                break;  
            }  
              
            System.out.println("�������, �������������֣�");  
            flag = false;  
        } while (!flag);  
    }  
  
   
  
    /*====================���������ӵ�еı���====================*/   
    public int  custNo    [];   // �˿͵Ļ�Ա��  
    public String   custBirth [];   // �˿͵�����  
    public int  custScore [];   // �˿͵Ļ���  
}  
