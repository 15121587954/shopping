package cn.itcast;
import java.util.Scanner;  
public class StaetSMS {
    /** 
     * �չ��췽�� 
     *  
     */  
    public StaetSMS() {  
    }   
    /** 
     * ϵͳ������ 
     *  
     * @param args 
     */  
    public static void main(String[] args) {  
          
        // �������е�������Ķ��󣬲���ʼ�����й˿���Ϣ  
        Data data = new Data();  
        data.initial();  
          
        // �����˵���Ķ���  
        Menu menu = new Menu();  
          
        // ���ｫ��ʼ��������������Ϣ�͸��˲˵�����  
        menu.setData(  
                 
                data.custNo,  
                data.custBirth,   
                data.custScore);  
         
        // ��ʾһ���˵�������¼����  
        menu.showLoginMenu();  
          
        // �ñ�־�����ж��Ƿ�����ϵͳ�������󣬵�����������ʱ��flagΪ�٣��Ӷ��˳�ϵͳ��Ĭ��Ϊ�޴���  
        boolean flag = true;  
          
        // ��������ϵͳ������  
        do {  
            // �������������˳�ϵͳ  
            if (!flag)  
                break;  
              
            // ������֤�û���¼���˻��������Ƿ���ȷ����Ķ�������ֻ�������󣬲�û��ִ����֤����  
            VerifyEqual verifyequal = new VerifyEqual();  
              
            // ����һ���˵��е�ѡ��  
            Scanner scanner = new Scanner(System.in);  
            int i = scanner.nextInt();  
              
            // �����û���һ���˵���ѡ��������ͬ����Ӧ��ע��������Ǿ����switch-case���÷�  
            switch (i) {  
                case 1: // �û�ѡ��"��¼ϵͳ"  
                      
                    // �������������ʾ�û����ֻ�ܳ���3�Σ�3���������ֱ���˳�ϵͳ  
                    int j = 3;  
                      
                    // �����¼ϵͳ������  
                    do {  
                        if (verifyequal.verify(data.manager.username,  
                                               data.manager.password)) {  
                            // �û���¼�ɹ�����ʾ��������˵�������  
                            menu.showMainMenu();  
                            break;  
                        }  
                          
                        if (j != 1) {  
                            // �û��������󣬻�û�дﵽ3�Σ�������������  
                            System.out.println("\n�û��������벻ƥ�䣬���������룺");  
                        } else {  
                            // 3�γ��Խ����������˳���־,���˳�do-whileѭ��  
                            System.out.println("\n��û��Ȩ�޽���ϵͳ��лл��");  
                            flag = false;  
                            break;  
                        }  
                          
                        // ÿ����һ�ν���������1�����ڱ�ʾ�Ѿ������˶��ٴ�  
                        j--;  
                    } while (true);  
                    break;  
      
                case 2: // �û�ѡ��"���Ĺ���Ա��Ϣ"  
                      
                    if (verifyequal.verify(data.manager.username,  
                                           data.manager.password)) {  
                        // ��������ϢǰҪ����֤ԭ������Ϣ���˴���ʾ�Ѿ���֤�ɹ�  
                        System.out.print("�������µ��û�����");  
                        data.manager.username = scanner.next();  
                        System.out.print("�������µ����룺");  
                        data.manager.password = scanner.next();  
                        System.out.println("�û����������Ѹ��ģ�");  
                          
                        // ��Ϣ���ĳɹ���ѡ����һ���Ĳ���  
                        System.out.println("\n��ѡ���������֣�");  
                    } else {  
                        // ��Ϣ��֤ʧ�ܣ������˳���־  
                        System.out.println("��Ǹ����û��Ȩ���޸ģ�");  
                        flag = false;  
                    }  
                    break;  
      
                case 3: // �û�ѡ��"�˳�"  
                      
                    System.out.println("лл����ʹ�ã�");  
                    System.exit(0);  
                    break;  
      
                default: // һ���˵����������Ҫ����ѡ��  
                      
                    System.out.print("\n��������������ѡ����������: ");  
                    break;  
            }  
        } while (flag);  
    }  
}
