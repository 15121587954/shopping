package cn.itcast;
import java.util.Scanner;
public class CustMangement {
	 /** 
     * �չ��췽�� 
	 * @return 
     *  
     */  
    public void CustManagement() {  
    }  
  
    /** 
     * ���ù˿���Ϣ�������������Ϣ 
     * @param ai 
     * @param as1 
     * @param ai1 
     */  
    public void setData( int ai[], String as1[], int ai1[]) {  
        
        custNo      = ai;  
        custBirth   = as1;  
        custScore   = ai1;  
    }  
  
    /** 
     * ������һ���˵����������˵�-�ͻ���Ϣ����˵� 
     *  
     */  
    public void returnLastMenu() {  
          
        System.out.print("\n\n�밴'n'������һ���˵�:");  
        Scanner scanner = new Scanner(System.in);  
          
        boolean flag = true;  
        do  
            if (scanner.next().equals("n")) {  
                // ������һ���˵��������½���һ���˵�����ֻ�����û�������ʵ����ͬ���Ĵ������̣�  
                // �������ڳ�����˵ȴ�ֿ�ʼ��һ���µĶ����˵���������  
                Menu menu = new Menu();  
                menu.setData(custNo, custBirth, custScore);  
                menu.showCustMMenu();  
            } else {  
                System.out.print("�������, ������'n'������һ���˵���");  
                flag = false;  
            }  
        while (!flag);  
    }  
  
    /** 
     * ��ӿͻ���Ϣ 
     *  
     */  
    public void add() {  
          
        System.out.println("�������ϵͳ > �ͻ���Ϣ���� > ��ӿͻ���Ϣ\n\n");  
        Scanner scanner = new Scanner(System.in);  
          
        System.out.print("�������Ա��(<4λ����>)��");  
        int i = scanner.nextInt();  
          
        System.out.print("�������Ա���գ���/��<����λ����ʾ>����");  
        String s = scanner.next();  
          
        System.out.print("��������֣�");  
        int j = scanner.nextInt();  
          
        int k = -1;  
        int l = 0;  
        do {  
            if (l >= custNo.length)  
                break;  
              
            // Ѱ�������еĵ�һ����λ�ã������洢�µĹ˿���Ϣ  
            if (custNo[l] == 0) {  
                k = l;  
                break;  
            }  
            l++;  
        } while (true);  
          
        custNo   [k] = i;  
        custBirth[k] = s;  
        custScore[k] = j;  
        System.out.println("�»�Ա��ӳɹ���");  
          
        // ������һ���˵�  
        returnLastMenu();  
    }  
  
    /** 
     * �޸Ŀͻ���Ϣ 
     *  
     */  
    public void modify() {  
          
        System.out.println("�������ϵͳ > �ͻ���Ϣ���� > �޸Ŀͻ���Ϣ\n\n");  
        System.out.print("�������Ա�ţ�()");  
        Scanner scanner = new Scanner(System.in);  
        int i = scanner.nextInt();  
          
        System.out.println("  ��Ա��            ����             ����      ");  
        System.out.println("------------|------------|---------------");  
          
        int j = -1;  
        int k = 0;  
        do {  
            if (k >= custNo.length)  
                break;  
              
            // ��ʾ�û�Ա����Ϣ  
            if (custNo[k] == i) {  
                System.out.println((new StringBuilder()).append(custNo[k])  
                        .append("\t\t").append(custBirth[k]).append("\t\t")  
                        .append(custScore[k]).toString());  
                j = k;  
                break;  
            }  
            k++;  
        } while (true);  
          
        // �û�Ա���ڣ�������޸���Ϣ����  
        if (j != -1) {  
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");  
            System.out.println("\t\t\t\t1.�� �� �� Ա �� ��.\n");  
            System.out.println("\t\t\t\t2.�� �� �� Ա �� ��.\n");  
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");  
            System.out.print("��ѡ���������֣�");  
              
            switch (scanner.nextInt()) {  
            case 1: // "�޸Ļ�Ա����"  
                System.out.print("�������޸ĺ�����գ�");  
                custBirth[j] = scanner.next();  
                System.out.println("������Ϣ�Ѹ��ģ�");  
                break;  
  
            case 2: // "�޸Ļ�Ա����"  
                System.out.print("�������޸ĺ�Ļ�Ա���֣�");  
                custScore[j] = scanner.nextInt();  
                System.out.println("��Ա�����Ѹ��ģ�");  
                break;  
            }  
        } else {  
            System.out.println("��Ǹ��û�����ѯ�Ļ�Ա��");  
        }  
          
        // ������һ���˵�  
        returnLastMenu();  
    }  
  
    /** 
     * ��ѯ�ͻ���Ϣ 
     *  
     */  
    public void search() {  
        System.out.println("�������ϵͳ > �ͻ���Ϣ���� > ��ѯ�ͻ���Ϣ\n");  
        Scanner scanner = new Scanner(System.in);  
          
        for (String s = "y"; s.equals("y"); s = scanner.next()) {  
            System.out.print("�������Ա�ţ�(<4λ����>)");  
            int i = scanner.nextInt();  
              
            System.out.println("  ��Ա��            ����             ����      ");  
            System.out.println("------------|------------|---------------");  
              
            boolean flag = false;  
            int j = 0;  
            do {  
                if (j >= custNo.length)  
                    break;  
                  
                // ��ʾ�û�Ա����Ϣ  
                if (custNo[j] == i) {  
                    System.out.println((new StringBuilder()).append(custNo[j])  
                            .append("\t\t").append(custBirth[j]).append("\t\t")  
                            .append(custScore[j]).toString());  
                    flag = true;  
                    break;  
                }  
                j++;  
            } while (true);  
              
            if (!flag)  
                System.out.println("��Ǹ��û�����ѯ�Ļ�Ա��Ϣ��");  
              
            System.out.print("\nҪ������ѯ��y/n��:");  
        }  
  
        // ������һ���˵�  
        returnLastMenu();  
    }  
  
    /** 
     * ��ʾ���пͻ���Ϣ 
     *  
     */  
    public void show() {  
          
        System.out.println("�������ϵͳ > �ͻ���Ϣ���� > ��ʾ�ͻ���Ϣ\n\n");  
        System.out.println("   ��Ա��                   ����                         ����      ");  
        System.out.println("------------|------------|---------------");  
          
        int i = custNo.length;  
        for (int j = 0; j < i && custNo[j] != 0; j++)  
            System.out.println((new StringBuilder()).append(custNo[j]).append(  
                    "\t\t").append(custBirth[j]).append("\t\t").append(  
                    custScore[j]).toString());  
  
        // ������һ���˵�  
        returnLastMenu();  
    }  
  
    
    public int  custNo    [];   // �˿͵Ļ�Ա��  
    public String   custBirth [];   // �˿͵�����  
    public int  custScore [];   // �˿͵Ļ���  
	public void setData(String[] goodsName, double[] goodsPrice, int[] custNo2, String[] custBirth2, int[] custScore2) {
		// TODO Auto-generated method stub
		
	}
}  

