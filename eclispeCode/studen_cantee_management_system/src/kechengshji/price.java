package kechengshji;

import java.awt.Transparency;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class price {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 price b=new price();
		 b.ser_book();
	}
	private dbutil dbUtil=new dbutil();//������������Ҫ��
	public void ser_book()
	{	
	  Connection con=null;
	  PreparedStatement pstmt = null;//׼�������
      ResultSet rs = null;
	  try {
			con=dbUtil.getCon();
		String sql="SELECT dishnum*dprice FROM price\r\n" + 
				"";
		// ��ȡִ��sql������
        pstmt=con.prepareStatement(sql);   //�����   
        // ִ�в�ѯ����
        rs=pstmt.executeQuery();	//ִ�в�ѯ��rs
        //��������
        while (rs.next()) {         	
            System.out.println("ÿһ�������ļ۸�"+rs.getString(1) );
            /*								��һ��							�ڶ���	
             * varchar������getstring������getint����			
             */
                          }
            }
		 catch(Exception e)
		    {
			e.printStackTrace();
		     }
		   finally
		   {
			try {
				dbUtil.closeCon(con);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
