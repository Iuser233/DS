package shiyan8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class booksinsert {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 booksinsert b=new booksinsert();
		 b.ser_book();
	}
	private DButil dbUtil=new DButil();//������������Ҫ��
	public void ser_book()
	{	
	  Connection con=null;
	  PreparedStatement pstmt = null;//׼�������
	  try {
		con=dbUtil.getCon();
String sql="INSERT  INTO `book`  VALUES ('ISBN97871 ','���ݿ�ϵͳ','����','��е',2010,'69.0','δ��','2'); ";		// ��ȡִ��sql������
		
        pstmt=con.prepareStatement(sql);   //�����   
        System.out.println("success");
        
        pstmt.executeUpdate(sql);
        
        // ִ�в�ѯ����
//        rs=pstmt.executeQuery();	//ִ�в�ѯ��rs
        //���������
            }
		 catch(Exception e)
		    {
			e.printStackTrace();
		     }
		  
	}
	

}