package kechengshji;

import java.awt.Transparency;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class view_order {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 view_order b=new view_order();
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
		String sql="SELECT * FROM stu_con;\r\n" + 
				"";
		// ��ȡִ��sql������
        pstmt=con.prepareStatement(sql);   //�����   
        // ִ�в�ѯ����
        rs=pstmt.executeQuery();	//ִ�в�ѯ��rs
        //���������
        while (rs.next()) {         	
            System.out.println("id��"+rs.getString(1)+"     sno��"+rs.getString(2)+"     ctimes��"+rs.getString(3)+"     dname��"+rs.getString(4)+"     dishnum��"+rs.getString(5));
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