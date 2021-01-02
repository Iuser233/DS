package shujujiego;
import java.util.Scanner;
public class bankSystem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("------欢迎使用自助存取款系统------");
			System.out.println("请输入账户密码（首次使用请按#注册）：");
			String account = scanner.nextLine();
			if (account.equals("#")) {
				System.out.println("请输入新的账户：");
				String account1 = scanner.nextLine();
				System.out.println("请输入密码：");
				String passwd1 = scanner.nextLine();
				System.out.println("请输入用户姓名：");
				String name1 = scanner.nextLine();
				BankOperate.regist(account1, passwd1, name1);
				continue;
			}
			System.out.println("请输入密码：");
			String passwd2 = scanner.nextLine();
			// BankOperate.logine(account, passwd2);
			boolean result = BankOperate.logine(account, passwd2);
			if (result) {
				System.out.println("登录成功，欢迎" + BankTool.account[BankTool.index].getName() + "光临");
				operate();
			} else {
				System.out.println("输入错误，请重新输入。");
			}
		}
	}
 
	public static void operate() {
		Scanner scanner1 = new Scanner(System.in);
		while (true) {
			System.out.println("请选择服务项目：");
			System.out.println("1.存款");
			System.out.println("2.取款");
			System.out.println("3.查询");
			System.out.println("4.退出");
			int n = scanner1.nextInt();
			switch (n) {
 
			case 1:
				System.out.println("请输入存款金额：");
				double money = scanner1.nextDouble();
				BankOperate.save(money);
 
				break;
			case 2:
				System.out.println("请输入取款金额：");
				double money1 = scanner1.nextDouble();
				BankOperate.take(money1);
				break;
			case 3:
				BankOperate.check();
				break;
			case 4:
 
				return;
 
			default:
				System.out.println("输入错误，请重新输入。");
				break;
			}
		}
	}
}

 
 class Account {
	String account;
	String passwd;
	String name;
	double money;
 
	public Account(String account, String passwd, String name) {
		this.account = account;
		this.passwd = passwd;
		this.name = name;
	}
 
	public String getAccount() {
		return account;
	}
 
	public void setAccount(String account) {
		this.account = account;
	}
 
	public String getPasswd() {
		return passwd;
	}
 
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public double getMoney() {
		return money;
	}
 
	public void setMoney(double money) {
		this.money = money;
	}
 
}

 
 class BankOperate {
	public static void regist(String account, String passwd, String name) {
		Account account1 = new Account(account, passwd, name);
		for (int i = 0; i < BankTool.account.length; i++) {
			if (BankTool.account[i] == null) {
				BankTool.account[i] = account1;
				System.out.println("注册成功");
				break;
			}
		}
	}
 
	public static boolean logine(String account, String passwd) {
		for (int i = 0; i < BankTool.account.length; i++) {
			if (BankTool.account[i] != null) {
				if (account.equals(BankTool.account[i].getAccount())
						&& passwd.equals(BankTool.account[i].getPasswd())) {
					BankTool.index = i;
					return true;
				}
			}
		}
		return false;
	}
 
	public static void save(double money) {
		BankTool.account[BankTool.index].setMoney(BankTool.account[BankTool.index].getMoney() + money);
		System.out.println("存钱成功");
	}
 
	public static void take(double money) {
		BankTool.account[BankTool.index].setMoney(BankTool.account[BankTool.index].getMoney() - money);
		System.out.println("取钱成功");
	}
 
	public static void check() {
		System.out.println("当前账户余额为："+BankTool.account[BankTool.index].getMoney());
	}
}

 
 class BankTool {
	public static Account[] account=new Account[100];
	public static int index=0;
}
