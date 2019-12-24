package cn.itcast;
import java.util.Scanner; /** 
 * 菜单类，用于显示所有级菜单供用户选择 */ 
public class Menu {

	public Menu() {  
    }  
  
    /** 
     * 设置菜单类中的数据信息 
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
     * 显示一级菜单，即登录界面 
     *  
     */  
    public void showLoginMenu() {  
        System.out.println("\n\n\t\t\t    欢迎使用并夕夕超级会员管理系统\n\n");  
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");  
        System.out.println("\t\t\t\t 1. 登 录 系 统\n\n");  
        System.out.println("\t\t\t\t 2. 更 改 管 理 员 信 息\n\n");  
        System.out.println("\t\t\t\t 3. 退 出\n\n");  
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");  
        System.out.print("请选择,输入数字:");  
    }  
  
    /** 
     * 显示二级菜单，即系统的主菜单，这个方法里面包含了对这个菜单处理的所有流程 
     *  
     */  
    @SuppressWarnings("resource")
	public void showMainMenu() {  
          
        // 显示二级菜单，即系统的主菜单  
        System.out.println("\n\n\t\t\t\t欢迎使用管理系统\n");  
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");  
        System.out.println("\t\t\t\t 1. 客 户 信 息 管 理\n");  
              
        System.out.println("\t\t\t\t 2. 退出\n");  
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");  
          
        // 用户选择服务项目  
        System.out.print("请选择,输入数字:");  
        Scanner scanner = new Scanner(System.in);  
          
        // 设置标志用于控制循环  
        boolean flag = false;  
        do {  
            String s = scanner.next();  
              
            // 用户选择"客户信息管理"  
            if (s.equals("1")) {  
                // 显示客户信息管理菜单并处理这个菜单的整个流程，当这个流程处理完  
                showCustMMenu();  
                break;  
            }             
            // 用户选择"退出"  
            if (s.equals("3")) {  
                // 显示一级菜单，此时会返回至StartSMS类中的一级菜单处理流程  
                showLoginMenu();  
                break;  
            }  
              
            System.out.print("输入错误，请重新输入数字：");  
            flag = false;  
        } while (!flag);  
    }  
  
    /** 
     * 显示三级菜单-客户信息管理，并处理所有客户信息管理的流程 
     *  
     */  
    @SuppressWarnings("resource")
    
	public void showCustMMenu() {  
        System.out.println("管理系统 > 客户信息管理\n");  
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");  
        System.out.println("\t\t\t\t 1. 显 示 所 有 客 户 信 息\n");  
        System.out.println("\t\t\t\t 2. 添 加 客 户 信 息\n");  
        System.out.println("\t\t\t\t 3. 修 改 客 户 信 息\n");  
        System.out.println("\t\t\t\t 4. 查 询 客 户 信 息\n");  
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");  
        System.out.print("请选择,输入数字或按'n'返回上一级菜单:");  
        Scanner scanner = new Scanner(System.in);  
          
        boolean flag = true;  
        do {  
            // 创建客户信息管理对象，并设置数据，这里的数据还是原始的那些数据  
            CustMangement custmanagement = new CustMangement();  
            custmanagement.setData( custNo, custBirth, custScore);  
              
            String s = scanner.next();  
              
            // 客户选择"显示所有客户信息"  
            if (s.equals("1")) {  
                custmanagement.show();  
                break;  
            }  
              
            // 客户选择"添加客户信息"  
            if (s.equals("2")) {  
                custmanagement.add();  
                break;  
            }  
              
            // 客户选择"修改客户信息"  
            if (s.equals("3")) {  
                custmanagement.modify();  
                break;  
            }  
              
            // 客户选择"查询客户信息"  
            if (s.equals("4")) {  
                custmanagement.search();  
                break;  
            }  
              
            // 客户选择"返回上一级菜单"  
            if (s.equals("n")) {  
                showMainMenu();  
                break;  
            }  
              
            System.out.println("输入错误, 请重新输入数字：");  
            flag = false;  
        } while (!flag);  
    }  
  
   
  
    /*====================定义该类所拥有的变量====================*/   
    public int  custNo    [];   // 顾客的会员号  
    public String   custBirth [];   // 顾客的生日  
    public int  custScore [];   // 顾客的积分  
}  
