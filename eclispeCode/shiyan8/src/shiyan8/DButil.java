package shiyan8;

import java.sql.Connection;
import java.sql.DriverManager;

public class DButil {
	//private String dbUrl="jdbc:mysql://localhost:3306/books?useUnicode=true&amp;characterEncoding=UTF8";//jdbc����
	private String jdbcName= "com.mysql.cj.jdbc.Driver";//jdbc��������	
	private String dbUrl="jdbc:mysql://localhost:3306/books?serverTimezone=PRC&useSSL=false&characterEncoding=utf8"; 
	private String dbUserName="root";//�û���						ʱ���ĳ��Ϻ�
	private String dbPassword="123";//����	
	
	
	/*������Ӷ��� */
	public Connection getCon() throws Exception{
		Class.forName(jdbcName);//��������
		Connection con=DriverManager.getConnection(dbUrl,dbUserName,dbPassword);//�������Ӷ����Ǹ����ݿ⣬�û�������
		return con;		
	}
	
	/*�Ͽ�����	 */
	public void closeCon(Connection con) throws Exception {
		if (con!=null){
			con.close();
		}		
	}
	
	/*���������������ݿ�*/ 
	public static void main(String[] args) {
		DButil dbUtil=new DButil(); //����
		try {
			dbUtil.getCon();
			System.out.println("���ӳɹ�");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("����ʧ��");
		}		
	}	
}