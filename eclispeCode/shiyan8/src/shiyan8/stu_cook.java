package shiyan8;

import java.util.Scanner;

import kechengshji.dbutil;

import java.io.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//���ô洢����ʵ�ֲ�ѯ
public class stu_cook {
	private dbutil dbUtil=new dbutil();
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("�������ò�ѧ��ѧ�ţ�"); 
        String sno= sc.nextLine();      //1.ȡ���û�������ַ��� 
        System.out.println("�����������ţ�"); 
        String cname= sc.nextLine();      //1.ȡ���û�������ַ��� 
        System.out.println("������۸��ţ�"); 
        String dprice= sc.nextLine();      //1.ȡ���û�������ַ��� 

        stu_cook b=new stu_cook();
        b.ser_reader(sno,cname,dprice);
   }
	public void ser_reader(String sno,String cname,String dprice)
	{	
	  Connection con=null;
	  CallableStatement cstmt = null;
      ResultSet rs = null;

      int canborrow=0;
	  try {
		con=dbUtil.getCon();
		String sql="call  student_cook(?,?,?);";
		// ��ȡִ��sql������
		cstmt=con.prepareCall(sql);
        // ׼������
		cstmt.setString(1, sno);  
		cstmt.setString(2, cname);  
		cstmt.setString(3, dprice);  
        rs=cstmt.executeQuery();	//ִ�в�ѯ��rs

    	while (rs.next()) {
            System.out.println("bookname��"+rs.getString(1)+"     auther��"+rs.getString(2)+"     price��"+rs.getString(3)+"     bookno��"+rs.getString(4));

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